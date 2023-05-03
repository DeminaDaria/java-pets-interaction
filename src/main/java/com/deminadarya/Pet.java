package com.deminadarya;

import java.util.HashMap;
import java.util.Map;

public abstract class Pet implements Ipet {
    private int age;
    private String color;
    private String name;
    private static Map<String, String> pets = new HashMap<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Голос!");
    }

    public static void myFriend() {
        pets.put("Муся", "Кот");
        pets.put("Бостон", "Пёс");
        System.out.println(pets);
    }
}
