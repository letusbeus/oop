package ru.letusbeus.OOPHomeworkFive;

public class View {
    public static void helloMessage() {
        System.out.println("Добро пожаловать в приложение авторизации ГикБрейнс!");
    }

    public static void requestLogin() {
        System.out.println("Введите логин");
    }

    public static void requestPassword() {
        System.out.println("Введите пароль");
    }

    public static void authorizationCompleted() {
        System.out.println("Авторизация успешна!");
    }

    public static void authorizationFailed() {
        System.out.println("Авторизация не удалась, проверьте логин и/или пароль");
    }

    public static void printRepoByAdmin() {
        System.out.println("\nПечать базы данных зарегистрированных пользователей: успешно");
        System.out.println(UserRepo.users);
    }

    public static void accessDenied() {
        System.out.println("\nВ доступе отказано, операция невозможна");
    }
}
