package com.geekbrains.let;

import com.geekbrains.player.Player;

public class Wall implements Obstacle {
    private final int height;

    public Wall() {
        this(10);
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean pass(Player player) {
        if (height <= player.getJumpHeight()) {
            player.jump();
            return true;
        }
        System.out.println(player.getClass().getSimpleName() + " не пробежал дорожку");
        return false;
    }
}
