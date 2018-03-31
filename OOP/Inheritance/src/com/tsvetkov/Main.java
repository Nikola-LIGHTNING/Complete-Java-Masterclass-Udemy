package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Corky", 8, 20, 2, 4, 1, 20, "long silky");

//        dog.eat();
//        dog.walk();
//        dog.run();
        Fish fishy = new Fish("Koko", 5, 666, 2, 2, 3);
        fishy.swim(10);
    }
}
