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
public class QuestionnareAnswers implements SaveableEntity{
    private List<Question> questionsAndAnswers = new ArrayList<>(
            Arrays.asList(
                    new Question("Atmosferę na kursie określił/a byś jako:", null),
                    new Question("Czy trenerzy się spozniaja:", null),
                    new Question("Jaki był poziom zajęć:", null),
                    new Question("Czy trener był pomocny:", null),
                    new Question("Czy nagradzanie kursantów motywuje:", null)
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
