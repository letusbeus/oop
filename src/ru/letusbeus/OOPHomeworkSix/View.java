package ru.letusbeus.OOPHomeworkSix;

public class View {
    public static void helloMessage() {
        System.out.println("Добро пожаловать в приложение авторизации ГикБрейнс!");
    }

    public static void requestLogin() {
        System.out.println("Введите логин: ");
    }

    public static void requestPassword() {
        System.out.println("Введите пароль: ");
    }
    public static void confirmPassword() {
        System.out.println("Подтвердите пароль: ");
    }
    public static void wrongPassword() {
        System.out.println("Пароли не совпадают");
    }

    public static void registrationCompleted() {
        System.out.println("Авторизация успешна!");
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

    public static void userExists() {
        System.out.println("Пользователь с указанными логином и паролем уже существует");
    }

    public static void userMenu() {
        System.out.println("""
                Выберите пункт меню:

                1 - Регистрация личного кабинета
                2 - Авторизация в личном кабинете
                3 - Вывод существующих пользователей на экран
                4 - Завершение работы программы""");
    }
}
