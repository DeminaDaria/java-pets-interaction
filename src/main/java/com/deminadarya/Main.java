package com.deminadarya;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(7, "Черный", "Муся");
        Dog dog = new Dog(4, "Мерль", "Бостон");

        cat.present();
        cat.eat();
        cat.playGame(true);
        cat.voice();

        System.out.println(" ");

        dog.present();
        dog.eat();
        dog.playGame(true);
        dog.voice();

        Pet.myFriend();
    }
}
