package com.solvd.olympicGames.service;

public enum Tournaments {
    QUADRUPLE("Quadruple", "First Round", "Current"),
    SEMIFINAL("Semi-Final", "Second Round", "in-progress"),
    FINAL("Final", "Third Round", "in-Progress");

    private String tournamentsName;
    private String tournamentsType;
    private String tournamentsStatus;

    Tournaments(String tournamentsName, String tournamentsType, String tournamentsStatus) {
        this.tournamentsName = tournamentsName;
        this.tournamentsType = tournamentsType;
        this.tournamentsStatus = tournamentsStatus;
    }

    public String getTournamentsName() {
        return tournamentsName;
    }

    public String getTournamentsType() {
        return tournamentsType;
    }

    public String getTournamentsStatus() {
        return tournamentsStatus;
    }
}
