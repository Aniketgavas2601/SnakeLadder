package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static void getWinner() {

        int playerPosition = 0;
        int diceRoll = 0;
        int snake[] = {30, 37, 57, 78, 99};
        int ladder[] = {3, 11, 35, 58, 74};

        for ( playerPosition = 1; playerPosition <= 100; playerPosition++) {
            diceRoll = (int) (Math.random() * 6);

            System.out.println("Dice Number :" + " " + diceRoll);

            playerPosition = playerPosition + diceRoll;
            playerPosition = playerPosition - 1;

            System.out.println("Current Position of Player :" + playerPosition);

            if (playerPosition == 100) {
                System.out.println("CONGRATULATIONS!! YOU WON THE GAME.");
            }

            if (diceRoll == 0) {

                playerPosition = playerPosition - diceRoll;

                System.out.println("Please Roll a Die");
            }

            if (playerPosition == snake[0]) {
                playerPosition = 10;

                System.out.println("Its a Snake.");
                System.out.println("you are Bitten By Snake.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == snake[1]) {
                playerPosition = 16;

                System.out.println("Its a Snake.");
                System.out.println("you are Bitten By Snake.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == snake[2]) {
                playerPosition = 32;

                System.out.println("Its a Snake.");
                System.out.println("you are Bitten By Snake.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == snake[3]) {
                playerPosition = 38;

                System.out.println("Its a Snake.");
                System.out.println("you are Bitten By Snake.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == snake[4]) {
                playerPosition = 12;

                System.out.println("Its a Snake.");
                System.out.println("you are Bitten By Snake.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == ladder[0]) {
                playerPosition = 23;

                System.out.println("Its a Ladder.");
                System.out.println("you got a Ladder.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == ladder[1]) {
                playerPosition = 45;

                System.out.println("Its a Ladder.");
                System.out.println("you got a Ladder.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == ladder[2]) {
                playerPosition = 54;

                System.out.println("Its a Ladder.");
                System.out.println("you got a Ladder.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == ladder[3]) {
                playerPosition = 85;

                System.out.println("Its a Ladder.");
                System.out.println("you got a Ladder.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == ladder[4]) {
                playerPosition = 96;

                System.out.println("Its a Ladder.");
                System.out.println("you got a Ladder.");
                System.out.println("You are at " + playerPosition + " position.");
            } else if (playerPosition > 100) {
                playerPosition = playerPosition - diceRoll;

                System.out.println("YOU CAN'T JUMP, YOU MUST LAND ON A 100.");
                System.out.println("You are at same position till the Exact Number Not get.");
            }
        }
        System.out.println("Number of Times The Dice was rolled to Win the Game =" + diceRoll);
    }

    public static void main(String[] args) {
        SnakeAndLadder sc = new SnakeAndLadder();
        sc.getWinner();
    }
}