package com.company;

import com.company.colections.AnswerList;
import com.company.colections.QuestionList;
import com.company.models.Answer;

import java.util.Scanner;

public class Test {
    private static int MAX_MARK = 100;



    QuestionList questionList = new QuestionList();
    AnswerList answerList = new AnswerList();
    Scanner scanner;

    public Test (QuestionList questionList,Scanner scanner){
        this.questionList = questionList;
        this.scanner = scanner;
    }

    private void makeExam(){
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(i+1+"."+questionList.get(i));
            System.out.print("Ваш ответ:");
            int ans = scanner.nextInt();
            AnswerList.add(new Answer(questionList.get(i),ans));

        }

    }

    private void showResult(){
        int countOfCorrect = 0;
        for (int i = 0; i < answerList.size(); i++) {
            Answer answer = answerList.get(i);
            if (answer.isCorrect()) countOfCorrect++;
            else{
                System.out.println("Ошибка");
                System.out.println(answer.getQuestionText());
                System.out.println("Правильный ответ:"+ answer.getCorrectAnswer());
            }

        }
        double mark = calculateMark(countOfCorrect);
        System.out.printf("Mark %f",mark);
    }

    private double calculateMark(int countOfCorrect) {
        double parts = ((double)countOfCorrect)/questionList.size();
        return parts*MAX_MARK;
    }

    private void reset() {
        answerList = new AnswerList();
    }

    public void run(){

        makeExam();
        showResult();
        reset();





    }


}
