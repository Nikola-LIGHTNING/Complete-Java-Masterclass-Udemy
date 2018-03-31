package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Koki");

	    dog.eat();
	    dog.breathe();

	    Bird berdie = new Parrot("Petko");

	    berdie.eat();
	    berdie.breathe();
	    berdie.fly();

	    Penguin emperor = new Penguin("Emo");
	    emperor.fly();
    }
}
