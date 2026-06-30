package com.etssu.guessing_game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    private final Scanner scanner;

    public InputManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter a number.");
                scanner.nextLine(); // clear bad input
            }
        }
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        scanner.nextLine();
        return scanner.nextLine();
    }
}
