package com.solvd.olympicGames.games;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SummerGames extends Games {
    private String summerSeason;
    private static final Logger logger = LogManager.getLogger(SummerGames.class);

    // ------------------------ Constructors -------------------------//
    public SummerGames() {
    }

    public SummerGames(String summerSeason) {
        this.summerSeason = summerSeason;
    }

    public SummerGames(int gameID, String gameName, String season, int year, String location, String summerSeason) {
        super(gameID, gameName, season, year, location);
        this.summerSeason = summerSeason;
    }

    // ------------------------ Setters -----------------------------//
    public void setSummerSeason(String summerSeason) {
        this.summerSeason = summerSeason;
    }

    // ------------------------ Getters -----------------------------//
    public String getSummerSeason() {
        return summerSeason;
    }
}
