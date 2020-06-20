package com.sda.javapoz25.gnf.files.odczyt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainCalyPlik {
    public static void main(String[] args) {
        // przy otwieraniu pliku, plik otwiera się na początku.
        try (BufferedReader reader = new BufferedReader(new FileReader("wyjscie"))) {
//            reader.skip(200) // omiń 200 znaków

            String linia;
//            do {
//                linia = reader.readLine();
//                System.out.println("Linia w pliku to: " + linia);
//            } while (linia != null);
            while ( (linia = reader.readLine())  != null){ //odczytanie linii i jej sprawdzenie w jednym warunku
                System.out.println("Linia w pliku to: " + linia);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
