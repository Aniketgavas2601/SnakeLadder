package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static void getDiceRoll(){
        int diceroll = 0;
        System.out.println("Start the Game");
        diceroll = (int) (Math.random() * 6 + 1);
        System.out.println("Dice Number: "+diceroll);

    }

    public static void main(String[] args) {
        SnakeAndLadder dice = new SnakeAndLadder();
        dice.getDiceRoll();
    }
}