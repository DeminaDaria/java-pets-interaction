package com.deminadarya;

public enum Game {
    BALL("Мяч"),
    ROPE("Верёвочка"),
    WRAPPER("Фанктик"),
    BONES("Кость"),
    FRISBEE("Фризби");

    private String nameGame;

    Game(String nameGame) {
        this.nameGame = nameGame;
    }

    public String getNameGame() {
        return nameGame;
    }
}
