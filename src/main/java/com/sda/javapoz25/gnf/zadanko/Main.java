package com.sda.javapoz25.gnf.zadanko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        wypelnijFormularzOdpowiedziami(scanner);
        wypelnijDaneUzytkownika(scanner);
    }

    private static void wypelnijDaneUzytkownika(Scanner scanner) {
        DataFileManager<UserIdAnswers> managerUsers = new DataFileManager<>("UserIdAnswers.json");
        UserIdAnswers userInfo = new UserIdAnswers();
        System.out.println("Podaj imie (opcjonalne):");
        userInfo.setImie(scanner.nextLine());

        System.out.println("Podaj nazwisko (opcjonalne):");
        userInfo.setNazwisko(scanner.nextLine());
        managerUsers.dopiszDoPliku(userInfo);
    }

    private static void wypelnijFormularzOdpowiedziami(Scanner scanner) {
        DataFileManager<QuestionnareAnswers> managerQuestions = new DataFileManager<>("QuestionnareAnswers.json");
        QuestionnareAnswers answers = new QuestionnareAnswers();
        System.out.println("Atmosferę na kursie określił/a byś jako:");
        answers.setAtmosphere(scanner.nextLine());

        System.out.println("Czy trenerzy się spozniaja:");
        answers.setTrenerLate(scanner.nextLine());

        System.out.println("Jaki był poziom zajęć:");
        answers.setClassLevel(scanner.nextLine());

        System.out.println("Czy trener był pomocny:");
        answers.setClassLevel(scanner.nextLine());

        System.out.println("Czy nagradzanie kursantów motywuje:");
        answers.setClassLevel(scanner.nextLine());
        managerQuestions.dopiszDoPliku(answers);
    }
}
