package com.etssu.guessing_game;


import java.util.Random;

public class GameLogic {
    private int maxChances;
    private int pcGuess;
    private int remainingChances;

    public void chooseDifficulty(Difficulty difficulty) {
        maxChances = difficulty.getMaxChances();
        remainingChances = maxChances;
    }

    public GuessResult makeGuess(int playerGuess) {
        if (playerGuess == pcGuess) {
            return GuessResult.CORRECT;
        } else if (playerGuess > pcGuess) {
            return GuessResult.TOO_HIGH;
        }  else {
            return GuessResult.TOO_LOW;
        }
    }

    public boolean isGameOver() {
        remainingChances--;
        return remainingChances < 0;
    }
    public void generateSecretNumber() {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        pcGuess = rand.nextInt((max - min) + 1) + min;
    }

    public int getSecretNumber() {
        return pcGuess;
    }

    public int getAttempts() {
        return maxChances - remainingChances;
    }

}
