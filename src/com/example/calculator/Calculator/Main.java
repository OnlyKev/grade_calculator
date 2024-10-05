package com.example.calculator.Calculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner weights = new Scanner(System.in);
        Scanner percentages = new Scanner(System.in);

        double temp_homework_weight = 0;
        double temp_homework_percentage = 0;

        double temp_quizzes_weight = 0;
        double temp_quizzes_percentage = 0;

        double temp_exam_weight = 0;
        double temp_exam_percentage = 0;

        System.out.println("Hello Client, please follow the instructions displayed below " +
                "to correctly calculate your grade :]\n");
        System.out.println("Enter weight for homework (1-100) (eg. %1 - %100 of total weight) ");
        temp_homework_weight = weights.nextDouble();
        System.out.println("Enter weight for quizzes (1-100) (eg. %1 - %100 of total weight) ");
        temp_quizzes_weight = weights.nextDouble();
        System.out.println("Enter weight for exams (1-100) (eg. %1 - %100 of total weight) ");
        temp_exam_weight = weights.nextDouble();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Enter percentage for homework (1-100) (eg. %1 - %100 of total weight) ");
        temp_homework_percentage = percentages.nextDouble();
        System.out.println("Enter percentage for quizzes (1-100) (eg. %1 - %100 of total weight) ");
        temp_quizzes_percentage = percentages.nextDouble();
        System.out.println("Enter percentage for exams (1-100) (eg. %1 - %100 of total weight) ");
        temp_exam_percentage = percentages.nextDouble();

        System.out.println("-------------------------------------------------------------------\n");
        Calculator.gradeWeight(temp_homework_weight, temp_quizzes_weight, temp_exam_weight);
        System.out.println("--------------------------33%-PROCESSED-----------------------------\n");
        Calculator.gradeCalculator(temp_homework_percentage, temp_quizzes_percentage, temp_exam_percentage);
        System.out.println("--------------------------66%-PROCESSED-----------------------------\n");
        Calculator.gradeCalculatorDisplay();
        System.out.println("--------------------------100%-PROCESSED-----------------------------\n");


    }
}

