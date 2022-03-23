package com.geekbrains.let;

import com.geekbrains.player.Player;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void pass(Player player) {
        if (player.isDo()) {
            if (height <= player.getJumpHeight()) {
                player.jump();
            } else {
                player.setDo(false);
                System.out.println(player.getClass().getSimpleName() + " не перепрыгнул стену и сошел с дистанции");
            }
        }

    }
}
