package com.cxytiandi.spring_boot_starter_demo.config;

public class UserClient {
    private UserProperties userProperties;

    public UserClient() {
    }

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName() {
        return userProperties.getName();
    }
}
