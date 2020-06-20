package com.sda.javapoz25.gnf.files.zapis;

import java.io.*;

public class MainSave {
    public static void main(String[] args) {
        File plik_do_zapisu = new File("do_zapisu");

        // IndexOutOfBoundsExecption
        // NullPointerException
        // ArithmeticException

        // IOException
        // print writer - printuje linia po linii.

        // GDY ZAPISUJECIE DO PLIKU KTÓRY NIE ISTNIEJE, TO PLIK ZOSTANIE STWORZONY AUTOMATYCZNIE
        // GDY SPRÓBUJEMY ZAPISAĆ DO ISTNIEJĄCEGO PLIKU, TO JEGO TREŚĆ ZOSTANIE KOMPLETNIE NADPISANA
        // JEŚLI CHCEMY TO ZMIENIĆ TO ROBIMY TO NA POZIOMIE WRITERA (FILEWRITER)

        // PLIKI I STRUMIENIE SIĘ ZAMYKA
        // wersja długa:
//        try {
//            Writer writer = new FileWriter(plik_do_zapisu, false); // flaga append = nadpisz/dopisz
//            PrintWriter printWriter = new PrintWriter(writer);
//
//            printWriter.println("Hello files!");
//
//            printWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // wersja skrócona
        // try with resources
        // zasób który można zamknąć, robię wewnątrz nawiasu

        // wersja skrócona jest zaimplementowana tak, żeby po zakończeniu bloku try obiekt z wnętrza nawiasu został
        //  automatycznie zamknięty (close())
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(plik_do_zapisu, false))) {
            printWriter.println("Hello files!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
