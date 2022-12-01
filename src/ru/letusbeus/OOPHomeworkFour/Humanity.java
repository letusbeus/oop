package ru.letusbeus.OOPHomeworkFour;

import java.util.ArrayList;
import java.util.Random;

public class Humanity {
    static ArrayList<String> humanity = new ArrayList<>();
    public static String createRandomHuman(int userInput) {
        Random rand = new Random();
        String humanFullName = "";
        switch (userInput) {
            case 1 -> {
                String maleName = Params.maleNames[rand.nextInt(Params.maleNames.length)];
                String maleSurname = Params.surnames[rand.nextInt(Params.surnames.length)];
                String malePatronymic = "";
                String nameForMalePatronymic = Params.maleNames[rand.nextInt(Params.maleNames.length)];
                if (nameForMalePatronymic.equals("Лев")) {
                    malePatronymic = "Львович";
                } else if (nameForMalePatronymic.equals("Илья")) {
                    malePatronymic = "Ильич";
                } else if (nameForMalePatronymic.endsWith("ей") ||
                        nameForMalePatronymic.endsWith("ай") ||
                        nameForMalePatronymic.endsWith("рь")) {
                    malePatronymic = nameForMalePatronymic.substring(0, nameForMalePatronymic.length() - 1) + "евич";
                } else if (nameForMalePatronymic.endsWith("ий")) {
                    malePatronymic = nameForMalePatronymic.substring(0, nameForMalePatronymic.length() - 2) + "иевич";
                } else if (nameForMalePatronymic.endsWith("ль")) {
                    malePatronymic = nameForMalePatronymic + "евич";
                } else {
                    malePatronymic = nameForMalePatronymic + "ович";
                }
                humanFullName = maleName + " " + malePatronymic + " " + maleSurname;
            }
            case 2 -> {
                String femaleName = Params.femaleNames[rand.nextInt(Params.femaleNames.length)];
                String femaleSurname;
                String femalePatronymic = "";

                String nameForMalePatronymic = Params.maleNames[rand.nextInt(Params.maleNames.length)];
                String surname = Params.surnames[rand.nextInt(Params.surnames.length)];
                if (surname.endsWith("ов") ||
                        surname.endsWith("ёв") ||
                        surname.endsWith("ев") ||
                        surname.endsWith("ын") ||
                        surname.endsWith("ин")) {
                    femaleSurname = surname + "а";
                } else if (surname.endsWith("ий")) {
                    femaleSurname = surname.substring(0, surname.length() - 2) + "ая";
                } else {
                    femaleSurname = surname;
                }
                if (nameForMalePatronymic.equals("Лев")) {
                    femalePatronymic = "Львовна";
                } else if (nameForMalePatronymic.equals("Илья")) {
                    femalePatronymic = "Ильинична";
                } else if (nameForMalePatronymic.endsWith("ей") ||
                        nameForMalePatronymic.endsWith("ай") ||
                        nameForMalePatronymic.endsWith("рь")) {
                    femalePatronymic = nameForMalePatronymic.substring(0, nameForMalePatronymic.length() - 1) + "евна";
                } else if (nameForMalePatronymic.endsWith("ий")) {
                    femalePatronymic = nameForMalePatronymic.substring(0, nameForMalePatronymic.length() - 2) + "иевна";
                } else if (nameForMalePatronymic.endsWith("ль")) {
                    femalePatronymic = nameForMalePatronymic + "евна";
                } else {
                    femalePatronymic = nameForMalePatronymic + "овна";
                }
                humanFullName = femaleName + " " + femalePatronymic + " " + femaleSurname;
            }
        }
        humanity.add(humanFullName);
        return String.valueOf(humanity);
    }
}
