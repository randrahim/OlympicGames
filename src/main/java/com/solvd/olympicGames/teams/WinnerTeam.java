package com.solvd.olympicGames.teams;

import com.solvd.olympicGames.people.Person;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class WinnerTeam extends Team {
    private String madel;
    private int winningRank;
    private static final Logger logger = LogManager.getLogger(WinnerTeam.class);

    // ------------------------ Constructors -------------------------//

    public WinnerTeam() {
    }

    public WinnerTeam(String madel, int winningRank) {
        this.madel = madel;
        this.winningRank = winningRank;
    }

    public WinnerTeam(int teamID, String teamName, int noOfAthlete, String madel, int winningRank) {
        super(teamID, teamName, noOfAthlete);
        this.madel = madel;
        this.winningRank = winningRank;
    }

    // ------------------------ Setters -------------------------//

    public void setMadel(String madel) {
        this.madel = madel;
    }

    public void setWinningRank(int winningRank) {
        this.winningRank = winningRank;
    }

    // ------------------------ Getters -------------------------//

    public String getMadel() {
        return madel;
    }

    public int getWinningRank() {
        return winningRank;
    }
}
