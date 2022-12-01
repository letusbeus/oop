package ru.letusbeus.OOPHomeworkFour;

import java.util.ArrayList;
import java.util.List;

public class Child extends Human {
    private boolean married;
    private Humans mother;
    private Humans father;

    static List<Child> children = new ArrayList<>();

    public Child(String name, String surname, Human.Gender gender, Humans mother, Humans father) {
        super(name, surname, gender);
        this.married = false;
        this.patronymic = (this.gender == "Male") ? name + "ovich" : name + "ovna";
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Mother: " + mother.getName() + " " + mother.getSurname() + "\n" +
                "Father: " + father.getName() + " " + father.getSurname() + "\n" +
                "fullname: " + name + " " + patronymic + " " + surname + "\n" +
                "gender: " + gender + "\n" +
                "married: " + married + "\n";
    }

    public boolean isMarried() {
        return married;
    }

    public Humans getMother() {
        return mother;
    }

    public Humans getFather() {
        return father;
    }
}
