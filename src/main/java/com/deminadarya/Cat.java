package com.deminadarya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cat extends Pet {

    public Cat(int age, String color, String name) {
        super(age, color, name);
    }

    public void playGame(boolean active) {
        Game[] games = new Game[]{Game.WRAPPER, Game.ROPE, Game.BALL};
        List<Game> collectionGame = Arrays.asList(games);
        ArrayList<Game> arrayGame = new ArrayList<>(collectionGame);
        if (active) {
            System.out.println("Котик готов играть");
            for (Game game : arrayGame) {
                System.out.println("У кота есть " + game.getNameGame());
            }
        } else {
            System.out.println("Котик не хочет играть");
        }
    }

    public void eat() {
        if (getAge() >= 7) {
            System.out.println("Котик ест лечебный корм");
        } else {
            System.out.println("Котик ест натуралку");
        }
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    public void present() {
        System.out.println("Меня зовут " + getName());
        System.out.println("Мне " + getAge());
        System.out.println("Мой окрас " + getColor());
    }
}
