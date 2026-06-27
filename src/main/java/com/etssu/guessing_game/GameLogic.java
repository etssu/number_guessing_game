package com.etssu.guessing_game;


import java.util.Random;

public class GameLogic {
    private int maxChances;
    private int pcGuess;

    public void chooseDifficulty(int difficulty) {
        switch (difficulty) {
            case 1:
                maxChances = 10;
                System.out.println("Great! You have selected the Medium difficulty level.\n" +
                        "Let's start the game!");
                break;
            case 2:
                maxChances = 5;
                System.out.println("Great! You have selected the Medium difficulty level.\n" +
                        "Let's start the game!");
                break;
            case 3:
                maxChances = 3;
                System.out.println("Great! You have selected the Hard difficulty level.\n" +
                        "Let's start the game!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public void startGuessing() {
        pcGuess = generateRandomNumber(); // generate a num between 1 and 100

        for (int trial = 1; trial <= maxChances; trial++) {
            System.out.print("Enter your guess: ");
            // entering guess
            if (isTheSameNum(playerGuess)) {
                System.out.println("Congratulations! You guessed the correct number in" + trial + " attempts.");
            } else if (playerGuess < pcGuess) {
                // playerGuess < pcGuess
            } else {
                // playerGuess > pcGuess
            }
        }
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        return rand.nextInt((max - min) + 1) + min;
    }

    public boolean isTheSameNum(int playerGuess) {
        return playerGuess == pcGuess;
    }
}
