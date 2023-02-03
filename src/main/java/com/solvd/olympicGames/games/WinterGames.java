package com.solvd.olympicGames.games;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class WinterGames extends Games {
    private String winterSeason;
    private static final Logger logger = LogManager.getLogger(WinterGames.class);

    // ------------------------ Constructors -------------------------//
    public WinterGames() {
    }

    public WinterGames(String winterSeason) {
        this.winterSeason = winterSeason;
    }

    public WinterGames(int gameID, String gameName, String season, int year, String location, String winterSeason) {
        super(gameID, gameName, season, year, location);
        this.winterSeason = winterSeason;
    }

    // ------------------------ Setters -----------------------------//
    public void setWinterSeason(String winterSeason) {
        this.winterSeason = winterSeason;
    }

    // ------------------------ Getters -----------------------------//
    public String getWinterSeason() {
        return winterSeason;
    }
}
