package com.timbuchalka;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;

        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
