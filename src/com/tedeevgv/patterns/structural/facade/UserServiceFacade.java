package com.tedeevgv.patterns.structural.facade;

public class UserServiceFacade {

    private UserService userService;

    public UserServiceFacade(UserService userService) {
        this.userService = userService;
    }

    void createUser(String login) {
        userService.saveUser(login);
        userService.addUserToWhiteList(login);
    }
}
