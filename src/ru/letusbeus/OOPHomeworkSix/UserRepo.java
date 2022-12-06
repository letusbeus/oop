package ru.letusbeus.OOPHomeworkSix;

import java.util.ArrayList;
import java.util.Arrays;

public class UserRepo {

    static ArrayList<User> users = new ArrayList<>(Arrays.asList(
            new User("user1", "password1", false),
            new User("user2", "password2", false),
            new User("admin", "admin", true)
    ));
    static User currentUser = null;
}
