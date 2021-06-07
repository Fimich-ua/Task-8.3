package com.company;

import com.company.colections.AnswerList;
import com.company.colections.QuestionList;
import com.company.models.Questions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuestionList questionList = new QuestionList();
        AnswerList answerList = new AnswerList();

        questionList.add(new Questions(
                "Столицей Франции является город?",
                new String[]{"Брюссель","Париж","Мадрид","Лиссабон"},
                2
        ));

        questionList.add(new Questions(
                "Столицей США является город?",
                new String[]{"Нью-Йорк","Вашингтон","Голливуд","Бостон"},
                2
        ));

        questionList.add(new Questions(
                "Столицей Южной Кореи является город?",
                new String[]{"Пхеньян","Тайбей","Сеул","Дакка"},
                3
        ));

        questionList.add(new Questions(
                "Столицей Турции является город?",
                new String[]{"Анталия","Анкара", "Стамбул", "Измир"},
                2
        ));

        questionList.add(new Questions(
                "Административной столицей ЮАР является город?",
                new String[]{"Йоханнесбург","Кейптаун","Претория","Дурбан"},
                3
        ));

        questionList.add(new Questions(
                "Столицей Сирии является город?",
                new String[]{"Дамаск","Алеппо","Бейрут","Амман"},
                1
        ));

        questionList.add(new Questions(
                "Столицей Канады является город?",
                new String[]{"Квебек","Оттава","Монреаль","Салливан"},
                2
        ));

        questionList.add(new Questions(
                "Столицей Багамских островов является город?",
                new String[]{"Кингстон","Каракас","Нассау","Фрипорт"},
                3
        ));

        questionList.add(new Questions(
                "Столицей Бразилии является город?",
                new String[]{"Буэнос-Айрес","Бразилиа","Сан-Паулу","Сантьяго"},
                2
        ));

        questionList.add(new Questions(
                "Столицей Алжира является город?",
                new String[]{"Рабат","Триполи","Алжир","Каир"},
                3
        ));

        Test test = new Test(questionList,scanner);
        test.run();




    }
}

