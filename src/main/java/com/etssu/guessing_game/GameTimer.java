package com.etssu.guessing_game;

public class GameTimer {
    private long startTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public long calculateTime() {
        return (System.currentTimeMillis() - startTime) / 1000;
    }
}
