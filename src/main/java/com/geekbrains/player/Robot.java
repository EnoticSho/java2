package com.geekbrains.player;

public class Robot implements Player {
    private final int range;
    private final int jumpHeight;
    private boolean isDo;

    public Robot(int range, int jumpHeight) {
        this.range = range;
        this.jumpHeight = jumpHeight;
        this.isDo = true;
    }

    @Override
    public void jump() {
        System.out.println("Робот перепрыгнул через препятсвие");
    }

    @Override
    public void run() {
        System.out.println("Робот пробежал дорожку");
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
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
