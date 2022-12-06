package ru.letusbeus.OOPHomeworkSix;

import java.util.Scanner;

public class Presenter {
    public static void userInterface() {
        View.helloMessage();
        boolean work = true;
        while (work) {
            View.userMenu();
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.next();
            switch (userChoice) {
                case "1" -> userRegistration();
                case "2" -> userAuthorization();
                case "3" -> printUserRepo();
                case "4" -> work = false;
            }

        }
    }

    public static void userAuthorization() {
        Scanner sc = new Scanner(System.in);
        View.requestLogin();
        String login = sc.next();
        View.requestPassword();
        String password = sc.next();
        if (Services.checkUserData(login, password)) {
            View.authorizationCompleted();
        } else {
            View.authorizationFailed();
        }
    }

    public static void userRegistration() {
        Scanner sc = new Scanner(System.in);
        View.requestLogin();
        String login = sc.next();
        View.requestPassword();
        String password = sc.next();
        View.confirmPassword();
        String confirmPassword = sc.next();
        if (!Services.checkUserData(login, password)) {
            if (password.equals(confirmPassword)) {
                Services.registerUser(login, password);
                View.registrationCompleted();
            } else View.wrongPassword();
        } else View.userExists();
    }

    public static void printUserRepo() {
        if (!Services.checkUserGrants()) {
            View.accessDenied();
        } else {
            View.printRepoByAdmin();
        }
    }
}
