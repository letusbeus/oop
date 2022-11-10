package ru.letusbeus.OOPHomeworkTwo;

public enum WeaponType {
    SWORD("клинок"),
    HANDGUN("револьвер");
    private final String weapon;

    WeaponType(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return weapon;
    }
}
