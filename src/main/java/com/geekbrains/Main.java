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
        c.doIt(team); // Просим команду пройти полосу
        team.playersInfo();
        team.showResults(); // Показываем результаты


//        Player[] players = new Player[3];
//        Obstacle[] obstacles = new Obstacle[2];
//        players[0] = new Human(4, 6);
//        players[1] = new Cat(6, 4);
//        players[2] = new Robot(2, 6);
//
//        obstacles[0] = new Racetrack(5);
//        obstacles[1] = new Wall(5);
//
//        for (Player player : players) {
//            for (Obstacle obstacle : obstacles) {
//                obstacle.pass(player);
//            }
//        }
    }
}
