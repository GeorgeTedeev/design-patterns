package com.tedeevgv.patterns.structural.facade;

public class FacadeClient {
    public static void main(String[] args) {
        String login = "new_user";

        // Without facade
        UserService userService = new UserService();
        userService.saveUser(login);
        userService.addUserToWhiteList(login);

        // With facade
        UserServiceFacade userServiceFacade = new UserServiceFacade(userService);
        userServiceFacade.createUser(login);
    }
}
