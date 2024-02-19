package com.example.demo;

public class Player {
    private int playerId;
    private String PlayerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        PlayerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
