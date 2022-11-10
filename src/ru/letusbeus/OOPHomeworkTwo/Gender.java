package ru.letusbeus.OOPHomeworkTwo;

public enum Gender {
    MALE("мужской"),
    FEMALE("женский");

    private final String gen;

    Gender(String gen) {
        this.gen = gen;
    }

    public String getName() {
        return gen;
    }
}
