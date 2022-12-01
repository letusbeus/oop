package ru.letusbeus.OOPHomeworkFour;

import java.util.*;

public class Humans extends Human implements CreateChild {
    static ArrayList<Humans> allHumans = new ArrayList<>();
    static GenealogicTree<Child> genealogicTree = new GenealogicTree<>();
    private boolean married;
    private int husbandID;
    private int wifeID;

    Humans(String name, String surname, String patronymic, Gender gender) {
        super(name, surname, gender);
        this.married = false;
        this.patronymic = patronymic;
    }


    @Override
    public String toString() {
        return "fullname: " + name + " " + patronymic + " " + surname + "\n" +
                "gender: " + gender + "\n " +
                "married = " + married;
    }

    public static void createHuman(Humans human, ArrayList<Humans> allHumans) {
        allHumans.add(human);
    }

    @Override
    public void createChild(Humans parent2, GenealogicTree<Child> genealogicTree) {


        if (!doMarrie(this, parent2)) {
            return;
        }
        String childName = getChildName(this, parent2);
        String surname = this.getSurname();
        Humans mother = (this.getGender() == "Female") ? this : parent2;
        Humans father = (this.getGender() == "Male") ? this : parent2;

        var child = new Child(childName, surname, Human.Gender.Male, mother, father);
        Child.children.add(child);
    }

    public static boolean doMarrie(Humans parent1, Humans parent2) {
        if (parent1.getGender() != parent2.getGender()) {
            if (!parent1.isMarried() && !parent2.isMarried()) {
                parent1.setMarried(true);
                parent2.setMarried(true);
            } else if (parent1.isMarried()) {
                System.out.printf("%s is already married, remarriage is not allowed.\n", parent1.getName());
                return false;
            } else if (parent2.isMarried()) {
                System.out.printf("%s is already married, remarriage is not allowed.\n", parent2.getName());
                return false;
            }
            if (parent1.getGender() == "Male") {
                parent2.setHusbandID(parent1.getId());
                parent1.setWifeID(parent2.getId());
            } else {
                parent1.setHusbandID(parent2.getId());
                parent2.setWifeID(parent1.getId());
            }

            if (parent1.getGender() == "Male") parent2.setSurname(parent1.getSurname());
            else parent1.setSurname(parent1.getSurname());
        } else {
            System.out.printf("Marriage between persons of the same sex (%s and %s) is prohibited.\n",
                    parent1.getName(), parent2.getName());
            return false;
        }
        return true;
    }

    public String getChildName(Humans parent1, Humans parent2) {
        String firstPart;
        String secondPart;
        if (parent1.getName().length() >= 3 && parent2.getName().length() >= 3) {
            firstPart = (parent1.getGender() == "Male") ? parent1.getName().substring(0, 2) : parent2.getName().substring(0, 2);
            secondPart = (parent1.getGender() == "Female") ? parent1.getName().substring(0, 2) : parent2.getName().substring(0, 2);

        } else {
            firstPart = (parent1.getGender() == "Male") ? parent1.getName().substring(0, 0) : parent2.getName().substring(0, 0);
            secondPart = (parent1.getGender() == "Female") ? parent1.getName().substring(0, 0) : parent2.getName().substring(0, 0);
        }
        return firstPart + secondPart;
    }

    public static void PrintTreeByID() {

        int id = getIdForSearch();

        for (int i = 0; i < Child.children.size(); i++) {
            if (id - 1 == i) {
                System.out.println(Child.children.get(i));
            }
        }
    }

    private static int getIdForSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the child's ID from 1 to %d to display their ancestry:\n", Child.children.size());

        return sc.nextInt();
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }


    public int getHusbandID() {
        return husbandID;
    }

    public void setHusbandID(int husbandID) {
        this.husbandID = husbandID;
    }

    public int getWifeID() {
        return wifeID;
    }

    public void setWifeID(int wifeID) {
        this.wifeID = wifeID;
    }
}
