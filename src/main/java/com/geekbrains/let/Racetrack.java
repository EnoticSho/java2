package com.geekbrains.let;

import com.geekbrains.player.Player;

public class Racetrack implements Obstacle {
    private final int length;

    public Racetrack() {
        this(10);
    }
    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean pass(Player player) {
        if (player.getRange() >= length) {
            player.run();
            return true;
        } else System.out.println(player.getClass().getSimpleName() + " не перепрыгнул стену");
        return false;
    }
}
