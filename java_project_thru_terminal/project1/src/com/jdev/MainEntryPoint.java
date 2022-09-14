package com.jdev;

import com.jdev.service.UserService;

public class MainEntryPoint {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.showUserInfo(10L);
    }

}
