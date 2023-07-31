package com.myapp.controller;

import com.example.assignment2cricket.CricketPlayer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PlayerDetailController
{
    @FXML
    private ImageView playerPosterImageView;

    @FXML
    private Label playerNameLabel;

    @FXML
    private Label countryLabel;

    @FXML
    private Label battingAverageLabel;

    @FXML
    private Label bowlingAverageLabel;

    public void setPlayerData(CricketPlayer player)
    {
        playerNameLabel.setText(player.getName());
        countryLabel.setText(player.getCountry());
        battingAverageLabel.setText("Batting Average: "+player.getOdiBattingAverage());
        bowlingAverageLabel.setText("Bowling Average: "+player.getOdiBowlingAverage());
    }
}
