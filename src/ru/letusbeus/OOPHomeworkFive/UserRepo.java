package ru.letusbeus.OOPHomeworkFive;

import java.util.ArrayList;
import java.util.Arrays;

public class UserRepo {

    static ArrayList<User> users = new ArrayList<>(Arrays.asList(
            new User("user1", "userPassword1", false),
            new User("user2", "userPassword2", false),
            new User("admin1", "adminPassword1", true),
            new User("admin2", "adminPassword2", true)
    ));
    static User currentUser = null;
}
