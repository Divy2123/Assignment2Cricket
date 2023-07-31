package com.example.assignment2cricket;

import java.util.List;

public class Player {
    private String name;
    private String role;
    private String battingStyle;
    private String bowlingStyle;
    private String placeOfBirth;
    private String country;
    private String playerImg;
    private List<Stats> stats;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getRole()
    {
        return role;
    }
    public void setRole(String role)
    {
        this.role = role;
    }
    public String getBattingStyle()
    {
        return battingStyle;
    }
    public void setBattingStyle(String battingStyle)
    {
        this.battingStyle = battingStyle;
    }
    public String getBowlingStyle()
    {
        return bowlingStyle;
    }
    public void setBowlingStyle(String bowlingStyle)
    {
        this.bowlingStyle = bowlingStyle;
    }

    public String getPlaceOfBirth()
    {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth)
    {
        this.placeOfBirth = placeOfBirth;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getPlayerImg() {
        return playerImg;
    }

    public void setPlayerImg(String playerImg)
    {
        this.playerImg = playerImg;
    }

    public List<Stats> getStats()
    {
        return stats;
    }

    public void setStats(List<Stats> stats)
    {
        this.stats = stats;
    }
}
