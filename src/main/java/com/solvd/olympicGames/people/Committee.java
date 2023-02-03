package com.solvd.olympicGames.people;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Committee extends Person {
    private int yearOfExperience;
    private String position;
    private static final Logger logger = LogManager.getLogger(Committee.class);

    // ------------------------ Constructors -------------------------//

    public Committee() {
    }

    public Committee(int yearOfExperience, String position) {
        this.yearOfExperience = yearOfExperience;
        this.position = position;
    }

    public Committee(String firstName, String lastName, String DOB, String address, String phoneNo, String email, String gender, int yearOfExperience, String position) {
        super(firstName, lastName, DOB, address, phoneNo, email, gender);
        this.yearOfExperience = yearOfExperience;
        this.position = position;
    }

    // ------------------------ Setters -----------------------------//

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // ------------------------ Getters -----------------------------//

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public String getPosition() {
        return position;
    }
}
