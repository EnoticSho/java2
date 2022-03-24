package com.geekbrains.player;

public class Cat implements Player {
    private final int range;
    private final int jumpHeight;
    private boolean isDo;

    public Cat(int range, int jumpHeight) {
        this.range = range;
        this.jumpHeight = jumpHeight;
        this.isDo = true;
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

    @Override
    public boolean isDo() {
        return isDo;
    }

    @Override
    public void setDo(boolean aDo) {
        isDo = aDo;
    }
}
