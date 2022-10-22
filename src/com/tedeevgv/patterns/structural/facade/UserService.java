package com.tedeevgv.patterns.structural.facade;

public class UserService {
    public void saveUser(String login) {
        System.out.println("User has been saved!");
    }
    public void addUserToWhiteList(String login) {
        System.out.println("User has been added to white list!");
    }
}
