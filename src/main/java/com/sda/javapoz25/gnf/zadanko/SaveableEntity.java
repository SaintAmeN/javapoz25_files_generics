package com.sda.javapoz25.gnf.zadanko;

import java.util.List;

public interface SaveableEntity {
    List<Question> getQuestionsAndAnswers();
    void setQuestionsAndAnswers(List<Question> questionsAndAnswers);
}
