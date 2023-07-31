package com.myapp;

import com.myapp.controller.MainController;
import com.myapp.model.APIService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/assignment2cricket/MainView.fxml"));
        Parent root = loader.load();
        MainController mainController = loader.getController();
        mainController.setStage(primaryStage);
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("/R.png"));
        primaryStage.setTitle("Cricket Player Stats");
        primaryStage.setScene(scene);
        primaryStage.show();
        APIService apiService = new APIService();
        mainController.setAPIService(apiService);
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
