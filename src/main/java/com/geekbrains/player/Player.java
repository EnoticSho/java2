package com.geekbrains.player;

public interface Player {
    void jump();

    void run();

    int getJumpHeight();

    int getRange();

    boolean isDo();

    void setDo(boolean aDo);
}
