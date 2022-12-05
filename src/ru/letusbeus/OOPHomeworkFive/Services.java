package ru.letusbeus.OOPHomeworkFive;

import static ru.letusbeus.OOPHomeworkFive.UserRepo.currentUser;

public class Services {
    public static boolean checkUserData(String login, String password) {
        for (User user : UserRepo.users) {
            if (user.getUserName().equals(login) && user.getPassword().equals(password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public static boolean checkUserGrants() {
        if (currentUser == null) {
            return false;
        }
        if (currentUser.isAdmin()) {
            return true;
        } else {
            return false;
        }
    }
}
