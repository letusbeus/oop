package ru.letusbeus.OOPHomeworkTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Services {


    public static Human man1 = new Human(
            "Михаил Федорович",
            Gender.MALE,
            "1596",
            "1645"
    );
    public static Human woman1 = new Human(
            "Евдокия Лукьяновна Стрешнева",
            Gender.FEMALE,
            "-",
            "1645"
    );
    public static Human man2 = new Human(
            "Алексей Михайлович",
            Gender.MALE,
            "1629",
            "1676"
    );
    public static Human woman2 = new Human(
            "Наталья Кирилловна Нарышкина",
            Gender.FEMALE,
            "1651",
            "1694"
    );
    public static Human man3 = new Human(
            "Петр 1 Алексеевич",
            Gender.MALE,
            "1672",
            "1725"
    );
    public static Human woman3 = new Human(
            "Екатерина 1 Алексеевна",
            Gender.FEMALE,
            "1684",
            "1727"
    );
    public static Human man4 = new Human(
            "Иоанн 5 Алексеевич",
            Gender.MALE,
            "1666",
            "1696"
    );
    public static Human woman4 = new Human(
            "Софья Алексеевна",
            Gender.FEMALE,
            "1657",
            "1704"
    );
    public static Human man5 = new Human(
            "Федор Алексеевич",
            Gender.MALE,
            "1661",
            "1682"
    );
    public static Human woman5 = new Human(
            "Марфа Матвеевна",
            Gender.FEMALE,
            "-",
            "1715"
    );
    public static Human woman6 = new Human(
            "Прасковья Федоровна Салтыкова",
            Gender.FEMALE,
            "1664",
            "1723"
    );
    public static ArrayList<Human> humanity = Services.createHumanity(); // создание части династии Романовых

    public static ArrayList<Human> createHumanity() {
        return new ArrayList<>(
                Arrays.asList(
                        man1
                                .setSpouse(woman1)
                                .setChildren(new ArrayList<>(Arrays.asList(man2))),
                        woman1
                                .setSpouse(man1)
                                .setChildren(new ArrayList<>(Arrays.asList(man2))),
                        man2
                                .setFather(man1)
                                .setMother(woman1)
                                .setSpouse(woman2)
                                .setChildren(new ArrayList<>(Arrays.asList(
                                        woman4,
                                        man5,
                                        man4,
                                        man3
                                ))),
                        woman2
                                .setSpouse(man2)
                                .setChildren(new ArrayList<>(Arrays.asList(
                                        woman4,
                                        man5,
                                        man4,
                                        man3
                                ))),
                        woman4
                                .setMother(woman2)
                                .setFather(man2),
                        man5
                                .setMother(woman2)
                                .setFather(man2)
                                .setSpouse(woman5),
                        woman5
                                .setSpouse(man5),
                        man4
                                .setMother(woman2)
                                .setFather(man2)
                                .setSpouse(woman6),
                        woman6
                                .setSpouse(man5),
                        man3
                                .setMother(woman2)
                                .setFather(man2)
                                .setSpouse(woman3),
                        woman3
                                .setSpouse(man3)

                )
        );
    }

    public static String printChildren(int human) {
        if (humanity.get(human).getChildren() != null)
            return humanity.get(human).getName() + " имеет следующих детей:\n" +
                    Arrays.toString(humanity.get(human).getChildren().toArray());
        else return humanity.get(human).getName() + " не имеет детей.";
    }

    public static String printSiblings(int human) {
        if (humanity.get(human).getFather() != null) {
            if (
                    (humanity.get(human).getFather().getChildren() != null)
                            &&
                            (humanity.get(human).getFather().getChildren().size() > 1)
            ) {
                return Arrays.toString(
                        humanity.get(human).
                                getFather().getChildren().
                                stream().
                                map(Human::getName).
                                toArray());
            } else return humanity.get(human).getName() + " не имеет братьев или сестер.";
        } else return "Неизвестно, имеет ли " +
                humanity.get(human).getName() +
                " братьев или сестер, поскольку информация о родителях отсутствует.";
    }

    // тут все работает
    public static void marry(Human man, Human woman) {
        man.setSpouse(woman);
        woman.setSpouse(man);
        System.out.printf("%s и %s поженились!\n", man.getName(), woman.getName());
    }

    //над этим я еше работаю, не могу обратиться к "новорожденному", полагаю, через stream получится, но пока думаю
    public static void makeChild(Human man, Human woman,
                                 String childName, Gender gender,
                                 String birthDate, String deathDate) {
        if (man.getSpouse().equals(woman) && woman.getSpouse().equals(man)) {
            Human child = new Human(childName, gender, birthDate, deathDate);
            man.setChildren(new ArrayList<>(Arrays.asList(child)));
            woman.setChildren(new ArrayList<>(Arrays.asList(child)));
            child.setFather(man);
            child.setMother(woman);
            humanity.add(child);
            System.out.printf("В %s году %s и %s стали родителями! Ребенка назвали %s.\n",
                    child.getBirthDate(),
                    man.getName(),
                    woman.getName(),
                    child.getName());
        } else {
            System.out.printf("%s и %s не женаты! Они не могут стать родителями :(\n",
                    man.getName(),
                    woman.getName());
        }
    }
}
