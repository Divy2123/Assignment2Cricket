package com.myapp.model;

import com.example.assignment2cricket.CricketPlayer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class APIService
{
    private static final String BASEURL = "https://api.cricapi.com/playerStats";
    private static final String APIKEY = "50d07fc3-d487-4834-b91a-fb671ad1b33e";
    public CricketPlayer getPlayerStats(String playerId) {
        CricketPlayer player = null;
        try
        {
            URL url = new URL(BASEURL + "/players/" + playerId);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + APIKEY);
            if (connection.getResponseCode()==HttpURLConnection.HTTP_OK) {
                BufferedReader reader =new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response= new StringBuilder();
                String line;
                while ((line=reader.readLine())!=null)response.append(line);
                reader.close();
                Gson gson =new Gson();
                player= gson.fromJson(response.toString(),CricketPlayer.class);
            }
            connection.disconnect();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return player;
    }
    public List<CricketPlayer> searchPlayersByName(String playerName)
    {
        List<CricketPlayer> matchingPlayers = new ArrayList<>();
        try
        {
            URL url = new URL(BASEURL + "?name=" + playerName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + APIKEY);
            if
            (connection.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) response.append(line);
                reader.close();
                Gson gson = new Gson();
                matchingPlayers = gson.fromJson(response.toString(), new TypeToken<List<CricketPlayer>>() {}.getType());
            }
            connection.disconnect();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return matchingPlayers;
    }

    public List<CricketPlayer> getAllPlayers()
    {
        List<CricketPlayer> allPlayers = new ArrayList<>();
        try
        {
            URL url = new URL(BASEURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + APIKEY);
            if(connection.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) response.append(line);
                reader.close();
                Gson gson = new Gson();
                allPlayers = gson.fromJson(response.toString(), new TypeToken<List<CricketPlayer>>() {}.getType());
            }
            connection.disconnect();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return allPlayers;
    }
}
