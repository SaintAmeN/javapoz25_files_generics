package com.sda.javapoz25.gnf.generics.before;

public class Main {
    public static void main(String[] args) {
//        List<String> // typ generyczny
//        Set<Integer> // typ generyczny

        Para para = new Para("String", "Tekst");

        // sprawdzenie w ifie zwraca true jesli prawa strona jest zadanego typu
        if(para.getPrawa() instanceof String) {
            // jeśli dokonujesz rzutowania na typ... powinieneś sprawdzić ich dopasowanie
            String prawa = (String) para.getPrawa();
            prawa += " hola!";
        }
    }
}
