package com.geekbrains.player;

public class Human implements Player {
    private final int range;
    private final int jumpHeight;
    private boolean isDo;

    public Human(int range, int jumpHeight) {
        this.range = range;
        this.jumpHeight = jumpHeight;
        this.isDo = true;
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

    public boolean isDo() {
        return isDo;
    }

    public void setDo(boolean aDo) {
        isDo = aDo;
    }
}
