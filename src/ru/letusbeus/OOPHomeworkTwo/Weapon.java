package ru.letusbeus.OOPHomeworkTwo;

public class Weapon implements Rewards {
    private final String name;
    private final WeaponType type;

    public Weapon(String name, WeaponType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + type.getName() + ")";
    }
}
