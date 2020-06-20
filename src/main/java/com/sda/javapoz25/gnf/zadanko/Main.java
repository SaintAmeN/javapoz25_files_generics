package com.sda.javapoz25.gnf.zadanko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        askAndSave(scanner, new QuestionnareAnswers());
        askAndSave(scanner, new UserIdAnswers());
    }

    private static <T extends SaveableEntity> void askAndSave(Scanner scanner, T obiekt) {
        DataFileManager<T> manager = new DataFileManager<>(obiekt.getClass().getSimpleName() + ".json");
        obiekt.getQuestionsAndAnswers().forEach(
                question -> {
                    System.out.println(question.getQuestion());
                    question.setAnswer(scanner.nextLine());
                }
        );
        manager.dopiszDoPliku(obiekt);
    }
//
//    private static void wypelnijDaneUzytkownika(Scanner scanner) {
//        DataFileManager<UserIdAnswers> managerUsers = new DataFileManager<>("UserIdAnswers.json");
//        UserIdAnswers userInfo = new UserIdAnswers();
//        userInfo.getQuestionsAndAnswers().forEach(
//                question -> {
//                    System.out.println(question.getQuestion());
//                    question.setAnswer(scanner.nextLine());
//                }
//        );
//        managerUsers.dopiszDoPliku(userInfo);
//    }
//
//    private static void wypelnijFormularzOdpowiedziami(Scanner scanner) {
//        DataFileManager<QuestionnareAnswers> managerQuestions = new DataFileManager<>("QuestionnareAnswers.json");
//        QuestionnareAnswers answers = new QuestionnareAnswers();
//        answers.getQuestionsAndAnswers().forEach(
//                question -> {
//                    System.out.println(question.getQuestion());
//                    question.setAnswer(scanner.nextLine());
//                }
//        );
//        managerQuestions.dopiszDoPliku(answers);
//    }
}
