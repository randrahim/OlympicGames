package com.solvd.olympicGames.games;

import com.solvd.olympicGames.people.Person;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class Games {
    private int gameID;
    private String gameName;
    private String season;
    private int year;
    private String location;
    private static final Logger logger = LogManager.getLogger(Games.class);

    // ------------------------ Constructors -------------------------//
    public Games() {
    }

    public Games(int gameID, String gameName, String season, int year, String location) {
        this.gameID = gameID;
        this.gameName = gameName;
        this.season = season;
        this.year = year;
        this.location = location;
    }

    // ------------------------ Setters -----------------------------//

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // ------------------------ Getters -----------------------------//

    public int getGameID() {
        return gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public String getSeason() {
        return season;
    }

    public int getYear() {
        return year;
    }

    public String getLocation() {
        return location;
    }
}
