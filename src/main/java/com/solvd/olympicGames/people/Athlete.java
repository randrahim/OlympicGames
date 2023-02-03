package com.solvd.olympicGames.people;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Athlete extends Person {
    private double weight;
    private double height;
    private static final Logger logger = LogManager.getLogger(Athlete.class);

    // ------------------------ Constructors -------------------------//
    public Athlete() {
    }

    public Athlete(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Athlete(String firstName, String lastName, String DOB, String address, String phoneNo, String email, String gender, double weight, double height) {
        super(firstName, lastName, DOB, address, phoneNo, email, gender);
        this.weight = weight;
        this.height = height;
    }

    // ------------------------ Setters -----------------------------//

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // ------------------------ Getters -----------------------------//

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
