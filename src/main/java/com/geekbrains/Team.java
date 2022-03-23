package com.geekbrains;

import com.geekbrains.player.Player;

public class Team {
    private final String name;
    private final Player[] players;

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void showResults(){
        for (Player player : players) {
            if (player.isDo()){
                System.out.println(player.getClass().getSimpleName() + " прошел всю дистанцию");
            }
        }
    }

    public void playersInfo(){
        for (int i = 1; i <= players.length; i++){
            System.out.printf("%d участник команды %s : %s ", i , name, players[i-1].getClass().getSimpleName());
            System.out.println();
        }
    }

    public Player[] getPlayers() {
        return players;
    }
}
