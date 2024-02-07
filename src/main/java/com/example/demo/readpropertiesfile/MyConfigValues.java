package com.example.demo.readpropertiesfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfigValues {

    @Value("${app.name}")
    private String appName;

    @Value("${app.port}")
    private long port;

    @Value("${app.database}")
    private String database;
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }


}
