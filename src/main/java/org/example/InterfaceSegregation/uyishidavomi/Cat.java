package org.example.InterfaceSegregation.uyishidavomi;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " miyovlaydi: Meow! Meow!");
    }


    public void scratch() {
        System.out.println(getName() + " tirnalgan yuzalarni tirnayapti.");
    }
}
