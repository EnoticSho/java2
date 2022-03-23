package com.geekbrains.player;

public class Human implements Player {
    private final int range;
    private final int jumpHeight;

    public Human(int range, int jumpHeight) {
        this.range = range;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Человек перепрыгнул через препятсвие");
    }

    @Override
    public void run() {
        System.out.println("Человек пробежал дорожку");
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRange() {
        return range;
    }
}
