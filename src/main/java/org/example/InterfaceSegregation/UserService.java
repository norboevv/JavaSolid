package org.example.InterfaceSegregation;

public interface UserService {
    void createUser(String name, String surname, int age);

    void activateUser(Integer userId);
}
