package com.company.colections;

import com.company.models.Questions;

import java.util.Arrays;

public class QuestionList {
    private Questions[] questions = new Questions[0];


    public int size() {
        return questions.length;
    }

    public Questions get(int index){
        return questions[index];
    }

    public void add (Questions q){
        questions = Arrays.copyOf(questions,questions.length+1);
        questions[questions.length-1] = q;
    }
}
