package com.sda.javapoz25.gnf.generics;

public class Main {
    public static void main(String[] args) {
//        List<String> // typ generyczny
//        Set<Integer> // typ generyczny

        Para<String, Long> para = new Para<>("String", 123L);

//        // sprawdzenie w ifie zwraca true jesli prawa strona jest zadanego typu
//        if(para.getPrawa() instanceof String) {
//            // jeśli dokonujesz rzutowania na typ... powinieneś sprawdzić ich dopasowanie
//            String prawa = (String) para.getPrawa();
//            prawa += " hola!";
//        }

        String wynik = para.getLewa() + " hola!";
        Long wartosc = para.getPrawa() + 3;
    }
}
