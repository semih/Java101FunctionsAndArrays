package main.java;

import java.util.Scanner;

public class ScoreCalculation {

    public static void main(String[] args) {

        int numberOfStudents = 4;
        int numberOfExams = 3;
        int totalScore = 0;
        float generalAverageScore = 0;
        Scanner keyboard = new Scanner(System.in);
        int[][] studentScores = new int[numberOfStudents][numberOfExams];


        for (int row = 0; row < numberOfStudents; row++) {
            for (int col = 0; col < numberOfExams; col++) {
                System.out.format("%d. öğrencinin %d. notunu giriniz: ", (row + 1), (col + 1));
                studentScores[row][col] = keyboard.nextInt();
                totalScore += studentScores[row][col];
            }

            float averageScore = (float) totalScore / numberOfExams;
            System.out.format("%d. öğrencinin ortalaması: %.2f %n", (row + 1), averageScore);
            totalScore = 0;
            generalAverageScore += averageScore;
        }

        System.out.format("Sınıf ortalaması: %.2f %n", generalAverageScore / 4);
    }
}
