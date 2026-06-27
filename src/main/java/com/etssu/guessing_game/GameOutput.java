package com.etssu.guessing_game;

import java.util.Scanner;

public class GameOutput {

    public void startGame() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)\n");
        System.out.print("Enter your choice: ");

        int difficulty = input.nextInt();
        GameLogic gl = new GameLogic();
        gl.chooseDifficulty(difficulty);


    }
}
