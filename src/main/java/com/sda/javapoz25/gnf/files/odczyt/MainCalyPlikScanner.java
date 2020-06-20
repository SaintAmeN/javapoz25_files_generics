package com.sda.javapoz25.gnf.files.odczyt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainCalyPlikScanner {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(new FileReader("wyjscie"))) {
            reader.nextInt(); //Exception in thread "main" java.util.InputMismatchException
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
