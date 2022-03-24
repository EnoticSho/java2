package com.geekbrains;

import com.geekbrains.let.Obstacle;
import com.geekbrains.let.Racetrack;
import com.geekbrains.let.Wall;
import com.geekbrains.player.Cat;
import com.geekbrains.player.Human;
import com.geekbrains.player.Player;
import com.geekbrains.player.Robot;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[]{new Racetrack(5), new Wall(5)});
        Team team = new Team("komanda",
                new Player[]{new Human(4, 6),
                        new Cat(6, 4),
                        new Robot(6, 6),
                        new Robot(2, 6)});
        c.doIt(team);
        team.playersInfo();
        team.showResults();
    }
}
