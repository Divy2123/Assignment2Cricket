package com.myapp.controller;

import com.example.assignment2cricket.CricketPlayer;
import com.myapp.model.APIService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class MainController {
    @FXML
    private Button apiCallButton;

    @FXML
    private ListView<CricketPlayer> playerListView;

    private Stage stage;
    private APIService apiService;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setAPIService() {
        setAPIService(null);
    }

    public void setAPIService(APIService apiService) {
        this.apiService = apiService;
    }

    public APIService getApiService() {
        return apiService;
    }
    @FXML
    private void onApi()
    {
        String playerId = "f57845b7-5277-4769-98f1-3b9a1c28d4a6";
        List<CricketPlayer> players = apiService.getAllPlayers();
        if (players != null) {
            playerListView.getItems().addAll(players);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Failed to fetch players data. Please try again later.");
            alert.showAndWait();
        }
    }
    @FXML
    private void onPlayerSelected()
    {
        CricketPlayer selectedPlayer = playerListView.getSelectionModel().getSelectedItem();
        if (selectedPlayer != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/assignment2cricket/PlayerDetailView.fxml"));
                Parent root = loader.load();
                PlayerDetailController playerDetailController = loader.getController();
                playerDetailController.setPlayerData(selectedPlayer);
                Scene scene = new Scene(root);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void onBackButtonClick() {
        playerListView.getSelectionModel().clearSelection();
        playerListView.getItems().clear();
        List<CricketPlayer> players = apiService.getAllPlayers();
        if (players != null) {
            playerListView.getItems().addAll(players);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Failed to fetch players data. Please try again later.");
            alert.showAndWait();
        }
    }

}
