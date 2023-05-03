package com.deminadarya;

public class Dog extends Pet {

    public Dog(int age, String color, String name) {
        super(age, color, name);
    }

    public void playGame(boolean active) {
        Game[] games = new Game[]{Game.BONES, Game.FRISBEE, Game.BALL};
        if (active) {
            System.out.println("Пёсик готов играть");
            for (Game game : games) {
                System.out.println("У пса есть " + game.getNameGame());
            }
        } else {
            System.out.println("Пёсик не хочет играть");
        }
    }

    public void eat() {
        if (getAge() >= 7) {
            System.out.println("Пёсик ест лечебный корм");
        } else {
            System.out.println("Пёсик ест натуралку");
        }
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    public void present() {
        System.out.println("Меня зовут " + getName());
        System.out.println("Мне " + getAge() + " годиков");
        System.out.println("Мой окрас " + getColor());
    }
}
