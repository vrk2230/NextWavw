package com.example.demo;

import java.util.ArrayList;


public interface Repository {
    ArrayList<Player> getAllPlayers();
    void getPlayerbyId(int playerId);
    void addPlayer(Player player);
    void updatePlayer(int playerId, Player player);
    void deletePlayer(int playerId);
}
