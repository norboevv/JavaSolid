package org.example.InterfaceSegregation.uyishidavomi;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Ali");
        Animal cat = new Cat("Vali");

        dog.makeSound();
        cat.makeSound();



    }
}