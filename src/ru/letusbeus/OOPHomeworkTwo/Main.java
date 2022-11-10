package ru.letusbeus.OOPHomeworkTwo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;

import static ru.letusbeus.OOPHomeworkTwo.Services.*;

public class Main {
    public static void main(String[] args) {
        humanity.get(0).setGift(new Weapon("наградное оружие", WeaponType.HANDGUN));
        humanity.get(1).setGift(new Medal("орден за мужество", 2));
        Human m11 = new Human("Папа", Gender.MALE, "1987", "-");
        Human w11 = new Human("Мама", Gender.FEMALE, "1984", "-");
        humanity.add(m11);
        humanity.add(w11);
        Services.marry(m11, w11);
        Services.makeChild(m11, w11, "Ребенок", Gender.FEMALE, "2022", "-");
        System.out.println(humanity.get(1).getRewards());
        System.out.println(humanity.get(0).getRewards());
//        System.out.println(printChildren(4)); // вывод на печать детей выбранного монарха
//        System.out.println(printChildren(1)); // вывод на печать детей выбранного монарха
//        System.out.println(printChildren(0)); // вывод на печать детей выбранного монарха
//        System.out.println(humanity.get(5)); // вывод на печать конкретного монарха
        System.out.println(printSiblings(5)); // вывод на печать братьев/сестер выбранного монарха
        System.out.println(printSiblings(2)); // вывод на печать братьев/сестер выбранного монарха
        System.out.println(printSiblings(1)); // вывод на печать братьев/сестер выбранного монарха
    }
}


