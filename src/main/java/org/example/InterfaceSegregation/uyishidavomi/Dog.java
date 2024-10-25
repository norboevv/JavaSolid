package org.example.InterfaceSegregation.uyishidavomi;

class Dog extends Animal { public Dog(String name) {super(name);}@Override public void makeSound() {System.out.println(getName() + " vovillaydi: Woof! Woof!");}
    public void fetch() {
        System.out.println(getName() + " topni olib keldi.");
    }
}
