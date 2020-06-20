package com.sda.javapoz25.gnf.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainSaveMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String komenda;

        // nie powinno się zbyt często otwierać plików
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("wyjscie", false))) {

            do {
                komenda = scanner.nextLine();

                printWriter.println(komenda);
                printWriter.flush(); // wymusza czyszczenie bufora i zapis do pliku

            } while (!komenda.equalsIgnoreCase("quit"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
