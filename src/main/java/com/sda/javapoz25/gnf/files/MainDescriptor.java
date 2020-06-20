package com.sda.javapoz25.gnf.files;

import java.io.File;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class MainDescriptor {
    // mechanizm refleksji              - 1 raz
    // adnotacje (w javie, jak tworzyć) - 1 raz
    public static void main(String[] args) {
        // zapis do pliku

        // File - deskryptor plików. Klasa reprezentująca informacje o pliku.
        // To nie jest klasa która służy do zapisu do pliku
        // Można ją wykorzystać, żeby wskazać adres pliku do którego chcemy zapisywać dane.

        // ścieżka absolutna - zaczyna się na początku drzewa plików
        // cztery poniższe linie są sobie równoznaczne:
//        File plik_do_zapisu = new File("C:\\Users\\akohsin\\IdeaProjects\\generics_files\\do_zapisu");
//        File plik_do_zapisu = new File("C:/Users/akohsin/IdeaProjects/generics_files/do_zapisu");
//        File plik_do_zapisu = new File("./do_zapisu"); // relatywna
//        File plik_do_zapisu = new File("do_zapisu"); // relatywna
        File plik_do_zapisu = new File("."); // kropka, czyli TEN KATALOG (w którym się znajduje)

        // cofnij sie o jeden katalog
//        File plik_do_zapisu = new File("../nowy_plik_txt"); // relatywna, cofam się o 1 katalog
//        File plik_do_zapisu = new File("../Program Files/Java/"); // relatywna, cofam się o 1 katalog, potem przechodzę do Java

//        Long timestamp = System.currentTimeMillis(); // timestamp - milisekundy od 1 stycznia 1970 roku.
        System.out.println("Nazwa: "+ plik_do_zapisu.getName());

        Timestamp timestamp = new Timestamp(plik_do_zapisu.lastModified());
        System.out.println("Data modyf: " + timestamp.toLocalDateTime());
        // pewna firma wymyśliła zakres liczb do faktur do 1920-2019
        System.out.println("Uprawnienia: " + plik_do_zapisu.canRead() + " " + plik_do_zapisu.canWrite() + " " + plik_do_zapisu.canExecute());
        System.out.println("Katalog?: " + plik_do_zapisu.isDirectory());
        if(plik_do_zapisu.isDirectory()){
            File[] tablica = plik_do_zapisu.listFiles();
            for (File file : tablica) {
                System.out.println(" => " + file.getName());
            }
        }
        System.out.println("Ukryty?: " + plik_do_zapisu.isHidden());
        System.out.println("Rozmiar: " + plik_do_zapisu.length());

//        plik_do_zapisu.createNewFile()    // stworz plik
//        plik_do_zapisu.mkdir()            // stworz katalog
//        plik_do_zapisu.delete()            // usun

    }
}
