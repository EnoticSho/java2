package com.geekbrains;

import com.geekbrains.let.Obstacle;
import com.geekbrains.player.Player;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Player[] players = team.getPlayers();
        for (Player player : players) {
            for (Obstacle obstacle : obstacles) {
                obstacle.pass(player);
            }
        }
    }
}
