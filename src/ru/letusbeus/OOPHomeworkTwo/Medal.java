package ru.letusbeus.OOPHomeworkTwo;

public class Medal implements Rewards {
    private final String name;
    private final Integer lvl;

    public Medal(String name, Integer lvl) {
        this.name = name;
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return name + " " + lvl + " степени";
    }
}
