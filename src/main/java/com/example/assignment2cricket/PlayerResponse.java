package com.example.assignment2cricket;

public class PlayerResponse {
    private String apikey;
    private Player data;
    private String status;
    private ProcessHandle.Info info;
    public String getApikey()
    {
        return apikey;
    }
    public void setApikey(String apikey)
    {
        this.apikey = apikey;
    }

    public Player getData()
    {
        return data;
    }

    public void setData(Player data)
    {
        this.data = data;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public ProcessHandle.Info getInfo()
    {
        return info;
    }

    public void setInfo(ProcessHandle.Info info)
    {
        this.info = info;
    }
}
