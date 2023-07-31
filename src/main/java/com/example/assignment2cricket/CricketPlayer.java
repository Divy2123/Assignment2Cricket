package com.example.assignment2cricket;

public class CricketPlayer {
    private String playerId;
    private String name;
    private String dateOfBirth;
    private String placeOfBirth;
    private String country;
    private String playerImg;
    private double odiBattingAverage;
    private int odiBallsFaced;
    private double odiBattingStrikeRate;

    private String odiBestBowlingInInnings;
    private String odiBestBowlingInMatch;
    private double odiBowlingEconomy;
    private double odiBowlingAverage;
    private double odiBowlingStrikeRate;

    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry()
    {
        return country;
    }

    public Double getOdiBattingAverage()
    {
        return odiBattingAverage;
    }

    public Double getOdiBowlingAverage()
    {
        return odiBowlingAverage;
    }

    public String getPlayerImg() {
        return playerImg;
    }
}
