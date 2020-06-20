package com.sda.javapoz25.gnf.files.odczyt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainCalyPlikStream {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("wyjscie"))) {
            reader.lines().forEach(linia -> System.out.println("Linia tekstu: " + linia));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
