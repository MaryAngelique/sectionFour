package com.timbuchalka;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);

        calculateScore(true, 10000, 8, 200);
        score = 800;
        levelCompleted = 5;
        bonus = 100;

        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }
}
