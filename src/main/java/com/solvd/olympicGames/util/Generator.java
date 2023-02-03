package com.solvd.olympicGames.util;

import com.solvd.olympicGames.games.SummerGames;
import com.solvd.olympicGames.games.WinterGames;
import com.solvd.olympicGames.people.Athlete;
import com.solvd.olympicGames.people.Committee;
import com.solvd.olympicGames.service.Madel;
import com.solvd.olympicGames.service.Tournaments;
import com.solvd.olympicGames.teams.WinnerTeam;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Generator {
    private static final Logger logger = LogManager.getLogger(Generator.class);

    //  Get Persons information ----------------------------------------------------------//
    public static Athlete generatorAthlete() {
        Athlete athlete = new Athlete();
        athlete.setFirstName("Jack");
        athlete.setLastName("Smith");
        athlete.setDOB("07/12/2000");
        athlete.setAddress("123 Street, City, State, Zipcode");
        athlete.setPhoneNo("1234567891");
        athlete.setEmail("jsmith@email.com");
        athlete.setGender("Male");
        athlete.setWeight(200);
        athlete.setHeight(5.9);
        return athlete;
    }

    public static Committee generatorCommittee() {
        Committee committee = new Committee();
        committee.setFirstName("Jack");
        committee.setLastName("Smith");
        committee.setDOB("07/12/2000");
        committee.setAddress("123 Street, City, State, Zipcode");
        committee.setPhoneNo("1234567891");
        committee.setEmail("jsmith@email.com");
        committee.setGender("Male");
        committee.setPosition("Head of Committees");
        committee.setYearOfExperience(10);
        return committee;
    }

    //  Get Games information ----------------------------------------------------------//
    public static SummerGames generatorSummerGames() {
        SummerGames summerGames = new SummerGames();
        summerGames.setGameID(123);
        summerGames.setGameName("Swimming");
        summerGames.setLocation("Japan");
        summerGames.setSeason("Summer");
        summerGames.setYear(2022);
        return summerGames;
    }

    public static WinterGames generatorWinterGames() {
        WinterGames winterGames = new WinterGames();
        winterGames.setGameID(123);
        winterGames.setGameName("Ski Jumping");
        winterGames.setLocation("Japan");
        winterGames.setSeason("Summer");
        winterGames.setYear(2022);
        return winterGames;
    }

    //  Get Winner Team information  ----------------------------------------------------------//
    public static WinnerTeam generatorWinnerTeam() {
        WinnerTeam winnerTeam = new WinnerTeam();
        winnerTeam.setTeamID(123);
        winnerTeam.setTeamName("The Winner");
        winnerTeam.setMadel("Gold");
        winnerTeam.setWinningRank(1);
        winnerTeam.setNoOfAthlete(5);
        return winnerTeam;
    }

    //  Get information from Enums classes ----------------------------------------------------------//
    public static Tournaments generatorTournaments() {
        //Using Enum to show the customer's satisfaction rate about the customer service.
        Tournaments tournaments = Tournaments.SEMIFINAL;
        return tournaments;
    }

    public static Madel generatorMadel() {
        //Using Enum to show the customer's satisfaction rate about the customer service.
        Madel madel = Madel.GOLD;
        return madel;
    }

}
