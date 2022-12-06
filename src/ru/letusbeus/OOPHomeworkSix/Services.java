package ru.letusbeus.OOPHomeworkSix;

import static ru.letusbeus.OOPHomeworkSix.UserRepo.currentUser;

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
        return currentUser.isAdmin();
    }

    public static void registerUser(String login, String password) {
        User user = new User(login, password, false);
        UserRepo.users.add(user);
    }
}
