package com.company;

import java.util.ArrayList;

public class QuizMaster {
    ArrayList <Question> quizQuestion;

    public void quizGrader(Boolean [] submittedAnswers) {
        int correctAnswers = 0;
        double grade =0;
        if (quizQuestion.size() > 0) {
            for ( int count = 0; count < submittedAnswers.length; count ++){
                correctAnswers += submittedAnswers[count] == true? 1:0; //if true returns 1 if false returns 0
            }
            grade = (correctAnswers/ quizQuestion.size()) * 100;
        }
        System.out.println("Your grade is:" + "" + grade + "%");
    }

    public void addQuestion(Question question) {
        quizQuestion.add(question);
    }

    public void runQuiz
}





