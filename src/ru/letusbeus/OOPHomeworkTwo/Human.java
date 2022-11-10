package ru.letusbeus.OOPHomeworkTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Human {
    private String name;
    private Gender gender;
    private String birthDate;
    private String deathDate;
    private Human mother;
    private Human father;
    private Human spouse;
    private ArrayList<Human> children;
    private ArrayList<Rewards> rewards;

    public void setGift(Rewards reward) {
        if(this.rewards == null)
            this.rewards = new ArrayList<>(Arrays.asList(reward));
        else this.rewards.add(reward);
    }

    public ArrayList<Rewards> getRewards() {
        return rewards;
    }

    public Human() {
    }

    public Human(String name, Gender gender, String birthDate, String deathDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public Human getMother() {
        return mother;
    }

    public Human setMother(Human mother) {
        this.mother = mother;
        return this;
    }

    public Human getFather() {
        return father;
    }

    public Human setFather(Human father) {
        this.father = father;
        return this;
    }

    public Human getSpouse() {
        return spouse;
    }

    public Human setSpouse(Human spouse) {
        this.spouse = spouse;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public Human setChildren(ArrayList<Human> children) {
        this.children = children;
        return this;
    }

    @Override
    public String toString() {
        return  name +
                "\n  пол: " + gender.getName() +
                "\n  дата рождения: " + birthDate +
                "\n  дата смерти: " + deathDate +
                "\n  мать: " + printHuman(mother) +
                "\n  отец: " + printHuman(father) +
                "\n  супруг(а): " + printHuman(spouse) +
                "\n  дети:\n  " + printChildren(children) +
                "\n  награды:\n  " + printGift(rewards)
                +"\n";
    }

    private String printHuman(Human human) {
        if (human != null) return human.name;
        else return "нет";
    }
    private String printChildren(ArrayList<Human> children) {
        if (children != null) return Arrays.toString(children.toArray());
        else return "Данный монарх не имеет детей.";
    }
    private String printGift(ArrayList<Rewards> rewards) {
        if (rewards != null) return Arrays.toString(rewards.toArray());
        else return "Данный монарх не имеет наград.";
    }
}