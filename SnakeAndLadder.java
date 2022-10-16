package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static void isPlayerPosition(){
        byte playerPosition = 0;
        System.out.println("Position of The Player at the time of Start the game: "+playerPosition);
    }

    public static void main(String[] args) {
        SnakeAndLadder ref = new SnakeAndLadder();
        ref.isPlayerPosition();
    }
}