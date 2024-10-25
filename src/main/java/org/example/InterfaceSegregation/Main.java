package org.example.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserService userServiceV2 = new UserServiceImplV2();
        userService.createUser("aposdjf", "opasduhfp", 1);
        userService.activateUser(1);
    }
}
