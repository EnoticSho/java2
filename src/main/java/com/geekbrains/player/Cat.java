package com.geekbrains.player;

public class Cat implements Player {
    private final int range;
    private final int jumpHeight;

    public Cat(int range, int jumpHeight) {
        this.range = range;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Кот перепрыгнул через препятсвие");
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал дорожку");
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRange() {
        return range;
    }
}
