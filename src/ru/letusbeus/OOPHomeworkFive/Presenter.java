package ru.letusbeus.OOPHomeworkFive;

import java.util.Scanner;

public class Presenter {

    public static void userAuthorization() {
        View.helloMessage();
        View.requestLogin();
        Scanner sc = new Scanner(System.in);
        String login = sc.next();
        View.requestPassword();
        String password = sc.next();
        if (Services.checkUserData(login, password)) {
            View.authorizationCompleted();
        } else {
            View.authorizationFailed();
        }
    }

    public static void printUserRepo() {
        if (!Services.checkUserGrants()) {
            View.accessDenied();
        } else {
            View.printRepoByAdmin();
        }
    }
}
