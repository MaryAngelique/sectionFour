package com.timbuchalka;

public class MethodOverload {

    public static void main(String[] args) {

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "score " + score + " points");
        return score * 1000;
    }


}
