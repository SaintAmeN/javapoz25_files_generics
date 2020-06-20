package com.sda.javapoz25.gnf.zadanko;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserIdAnswers implements SaveableEntity{
    private List<Question> questionsAndAnswers = new ArrayList<>(
            Arrays.asList(
                    new Question("Podaj imie (opcjonalne):", null),
                    new Question("Podaj nazwisko (opcjonalne):", null)
            )
    );

    @Override
    public List<Question> getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }

    @Override
    public void setQuestionsAndAnswers(List<Question> questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
    }
}
