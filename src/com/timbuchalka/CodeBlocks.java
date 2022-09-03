package com.timbuchalka;

public class CodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000) {
//            System.out.println("Your score was less than 5000");
//        } else if  (score < 1000) {
//            System.out.println("Your score is less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        // Print our a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure te first print out above still displays as well

        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;



    }
}
