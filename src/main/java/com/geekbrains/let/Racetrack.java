package com.geekbrains.let;

import com.geekbrains.player.Player;

public class Racetrack implements Obstacle {
    private final int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public void pass(Player player) {
        if (player.isDo()) {
            if (player.getRange() >= length) {
                player.run();
            } else {
                player.setDo(false);
                System.out.println(player.getClass().getSimpleName() + " не пробежал дорожку и сошел с дистанции");
            }
        }
    }
}
