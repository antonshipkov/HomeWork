package HomeWork1;

import java.util.Scanner;

public class HomeWork1_5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Имя:");
        String name = in.next();
        if (name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if (name.equals("Анастасия")){
                System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
        in.close();
    }
}
