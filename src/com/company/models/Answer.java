package com.company.models;

public class Answer {
    private Questions questions;
    private int answer;

    public Answer(Questions questions, int answer) {
        this.questions = questions;
        this.answer = answer;
    }

    public boolean isCorrect(){
        return questions.getCorrectVariant() == answer;
    }

    public String getCorrectAnswer () {
        return questions.getCorrectVariant() + ". " + questions.getCorrectVariantText();
    }

    public String getQuestionText() {
        return questions.getText();
    }
}
