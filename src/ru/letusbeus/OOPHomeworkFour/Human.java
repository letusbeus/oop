package ru.letusbeus.OOPHomeworkFour;

public abstract class Human {
    String name;
    String patronymic;
    String surname;
    int id;
    static int count = 0;
    String gender;


    public enum Gender{
        Male,
        Female
    }

    public Human(String name, String surname, Gender gender) {
        this.name = name;
        this.patronymic = name;
        this.surname = surname;
        count++;
        this.id = count;
        this.gender = gender.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Human.count = count;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}