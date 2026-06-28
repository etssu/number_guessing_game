package com.etssu.guessing_game;

public enum Difficulty {
    EASY(1, 10),
    MEDIUM(2, 5),
    HARD(3, 3);

    private final int maxChances;
    private final int choice;


    Difficulty(int choice, int maxChances) {
        this.choice = choice;
        this.maxChances = maxChances;
    }

    public static Difficulty fromChoice(int choice) {
        for (Difficulty difficulty : values()) {
            if (difficulty.choice == choice) {
                return difficulty;
            }
        }

        throw new IllegalArgumentException("Invalid difficulty");
    }

    public int getMaxChances() {
        return maxChances;
    }

    @Override
    public String toString() {
        switch (this) {
            case EASY:
                return "Easy";
            case MEDIUM:
                return "Medium";
            case HARD:
                return "Hard";
            default:
                return super.toString();
        }
    }
}
