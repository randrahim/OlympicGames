package com.solvd.olympicGames.service;

public enum Madel {
    GOLD (1, "Gold"),
    SILVER (2, "Silver"),
    BRONZE(3,"Bronze"),
    Award(4, "Award Certificate");

    private int rank;
    private String madeOf;

    Madel(int rank, String madeOf) {
        this.rank = rank;
        this.madeOf = madeOf;
    }

    public int getRank() {
        return rank;
    }

    public String getMadeOf() {
        return madeOf;
    }
}
