package ru.letusbeus.OOPHomeworkOne;

import static ru.letusbeus.OOPHomeworkOne.Services.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(humanity); // вывод на печать созданной части династии Романовых
        System.out.println(printChildren(4)); // вывод на печать детей выбранного монарха
        System.out.println(printChildren(4)); // вывод на печать детей выбранного монарха
        System.out.println(printChildren(3)); // вывод на печать детей выбранного монарха
        System.out.println(printChildren(0)); // вывод на печать детей выбранного монарха
        System.out.println(humanity.get(5)); // вывод на печать конкретного монарха
        System.out.println(printSiblings(5)); // вывод на печать братьев/сестер выбранного монарха
        System.out.println(printSiblings(1)); // вывод на печать братьев/сестер выбранного монарха
    }
}


