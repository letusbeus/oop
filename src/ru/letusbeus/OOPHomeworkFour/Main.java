package ru.letusbeus.OOPHomeworkFour;

// Создала дополнительно Humanity и Params, по итогу хочу создавать рандомных людей и детей,
// наследующих отчество родителя с учетом норм русского языка. Пока не прикрутила.

public class Main {
    public static void main(String[] args) {
        Humans.createHuman(new Humans("Vasya","Petroff","Kirillovich",Human.Gender.Male),
                Humans.allHumans);
        Humans.createHuman(new Humans("Petr","Vasyleff","Anatolyevich",Human.Gender.Male),
                Humans.allHumans);
        Humans.createHuman(new Humans("Ivan","Ivanoff","Mikhaylovich", Human.Gender.Male),
                Humans.allHumans);
        Humans.createHuman(new Humans("Arina","Rodionova","Fedorovna", Human.Gender.Female),
                Humans.allHumans);
        Humans.createHuman(new Humans("Marina","Sidorova","Petrovna", Human.Gender.Female),
                Humans.allHumans);
        Humans.createHuman(new Humans("Olga","Kozlova","Andreevna", Human.Gender.Female),
                Humans.allHumans);

        Humans.allHumans.get(0).createChild(Humans.allHumans.get(3), Humans.genealogicTree); // marriage&childbirth
        Humans.allHumans.get(1).createChild(Humans.allHumans.get(4), Humans.genealogicTree); // marriage&childbirth
        Humans.allHumans.get(2).createChild(Humans.allHumans.get(3), Humans.genealogicTree); // remarriage
        Humans.allHumans.get(1).createChild(Humans.allHumans.get(2), Humans.genealogicTree); // same-sex marriage
        Humans.PrintTreeByID();
    }
}