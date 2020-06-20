package com.sda.javapoz25.gnf.files.zapis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainSaveMultiple_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String komenda;
        do {
            komenda = scanner.nextLine();

            // zbyt często otwieramy plik
            try (PrintWriter printWriter = new PrintWriter(new FileWriter("wyjscie", true))) {
                printWriter.println(komenda);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!komenda.equalsIgnoreCase("quit"));

    }
}
