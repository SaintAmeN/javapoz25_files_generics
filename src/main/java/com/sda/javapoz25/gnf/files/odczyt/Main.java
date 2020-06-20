package com.sda.javapoz25.gnf.files.odczyt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // przy otwieraniu pliku, plik otwiera się na początku.
        try (BufferedReader reader = new BufferedReader(new FileReader("wejscie"))){
//            reader.skip(200) // omiń 200 znaków

            String linia = reader.readLine();
            System.out.println("1 Linia w pliku to: " + linia);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
