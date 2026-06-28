package com.etssu.guessing_game;

import java.util.Scanner;

public class GameOutput {

    public void startGame() {
        InputManager input = new InputManager(new Scanner(System.in));
        GameLogic logic = new GameLogic();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)\n");

        Difficulty difficulty;

        while (true) {
             try {
                difficulty = Difficulty.fromChoice(input.readInt("Enter your choice: "));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice.");
            }
        }
        logic.chooseDifficulty(difficulty);

        logic.generateSecretNumber();

        System.out.println("Great! You have selected the " + difficulty + " difficulty level.");
        System.out.println("Let's start the game!\n");


        while (!logic.isGameOver()) {
            int guess = input.readInt("Enter your guess: ");

            GuessResult result = logic.makeGuess(guess);

            switch (result) {
                case CORRECT:
                    System.out.println("Congratulations! You guessed the correct number in " + logic.getRemainingChances()
                            + " attempts.\n");
                    return;
                case TOO_HIGH:
                    System.out.println("Incorrect! The number is less than " + guess + ".\n");
                    break;
                case TOO_LOW:
                    System.out.println("Incorrect! The number is greater than " + guess + ".\n");
                    break;
            }
        }
        System.out.println("Sorry, you've used all of your chances!");
        System.out.println("The correct number was " + logic.getSecretNumber() + ".");
    }
}
