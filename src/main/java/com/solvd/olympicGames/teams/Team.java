package com.solvd.olympicGames.teams;

import com.solvd.olympicGames.people.Person;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class Team {
    private int teamID;
    private String teamName;
    private int noOfAthlete;
    private static final Logger logger = LogManager.getLogger(Team.class);

    // ------------------------ Constructors -------------------------//
    public Team() {
    }

    public Team(int teamID, String teamName, int noOfAthlete) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.noOfAthlete = noOfAthlete;
    }

    // ------------------------ Setters -------------------------//
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setNoOfAthlete(int noOfAthlete) {
        this.noOfAthlete = noOfAthlete;
    }

    // ------------------------ Getters -------------------------//
    public int getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNoOfAthlete() {
        return noOfAthlete;
    }
}
