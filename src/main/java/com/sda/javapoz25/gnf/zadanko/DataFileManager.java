package com.sda.javapoz25.gnf.zadanko;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Manager zarządza plikiem w którym jest lista rekordów.
 * <p>
 * [
 * {
 * ... 5 1 9 0 8 8 3 9 9
 * },
 * ]
 */
public class DataFileManager<T extends SaveableEntity> {
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final String fileName;

    public DataFileManager(String fileName) {
        this.fileName = fileName;
    }

    public List<T> odczytajZPliku() {
        List<T> results = new ArrayList<>();

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String linia;
            while ((linia = reader.readLine()) != null) { //zbieram całą treść pliku do jednego stringa.
                result.append(linia);
            }

            TypeReference<List<T>> reference = new TypeReference<List<T>>(){};
            List<T> obiektyWPliku = OBJECT_MAPPER.readValue(result.toString(), reference);
            results.addAll(obiektyWPliku);
        } catch (IOException e) {
            System.err.println("Błąd odczytu."); // jeśli będzie błąd odczytu to treść pliku zostanie usunięta
            // nie odczytamy jego treści
        }

        return results;
    }

    /**
     * Żeby dopisać coś do pliku, najpierw muszę odczytać treść tego pliku, następnie możemy dodać
     * nowy obiekt do kolekcji i zapisać całą kolekcję ponownie do pliku.
     *
     * @param entity - obiekt który ma być dopisany do pliku.
     */
    public void dopiszDoPliku(T entity) {
        List<T> answers = odczytajZPliku();
        answers.add(entity);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            String resultString = OBJECT_MAPPER.writeValueAsString(answers);

            writer.println(resultString);
        } catch (JsonProcessingException e) {
            System.err.println("Błąd przetwarzania JSON.");
        } catch (IOException e) {
            System.err.println("Błąd odczytu/zapisu/otwierania pliku.");
        }

        System.out.println("Plik zapisany.");
    }
}
