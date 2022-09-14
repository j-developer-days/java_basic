package com.jdev.project2;

import com.jdev.service.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.showUserInfo(150L);
        System.out.println("Here in PROJECT2 we use classes from PROJECT1");
    }

}
