package HomeWork1;

import java.util.Scanner;

public class HomeWork1_5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Имя:");
        String name = in.next();
        String friend = "Вася";
        String girlfriend = "Анастасия";
        if (name.equals(friend)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (name.equals(girlfriend)){
            System.out.println("Я тебя так долго ждал");
        }
        if (!name.equals(friend)&&!name.equals(girlfriend)) {
            System.out.println("Добрый день, а вы кто?");
        }

        in.close();
    }
}
