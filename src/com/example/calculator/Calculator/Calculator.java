package com.example.calculator.Calculator;

public class Calculator implements gradeCalculator {

    // purpose of method is to assign weight of each catagory based on the clients requirements
    public static void gradeWeight(double homework, double quizzes, double exams) {
        homework_weight = homework / 100;
        quizzes_weight = quizzes / 100;
        exams_weight = exams / 100;
    }

    // handles grade calculations with the help of great weight
    public static void gradeCalculator(double homework, double quizzes, double exams) {
        homework_percentages = homework;
        quizzes_percentages = quizzes;
        exams_percentages = exams;

        final_grade = (homework * homework_weight) + (quizzes * quizzes_weight) + (exams * exams_weight);

    }

    // handles the display of grade calculations to the client
    public static void gradeCalculatorDisplay() {
        System.out.println("Homework Weight: " + homework_weight);
        System.out.println("Quizzes Weight: " + quizzes_weight);
        System.out.println("Exam Weight: " + exams_weight);
        System.out.println("\n");
        System.out.println("Homework percentages: " + homework_percentages);
        System.out.println("Quizzes percentages: " + quizzes_percentages);
        System.out.println("Exam percentages: " + exams_percentages);
        System.out.println("\n");
        System.out.println("Final grade: " + final_grade);
    }

    private static double homework_percentages;
    private static double quizzes_percentages;
    private static double exams_percentages;
    private static double final_grade;
    private static double homework_weight;
    private static double quizzes_weight;
    private static double exams_weight;
}
