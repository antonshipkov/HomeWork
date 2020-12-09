package HomeWork1;
import java.util.Scanner;

public class HomeWork_loops_2_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Число:");
        double num = in.nextInt();
        System.out.print("Введите Степень:");
        int degree = in.nextInt();
        double sum= 1;
        for (int i = 1; i <= degree; i++) {
            sum = sum * num;
        }
        System.out.println("Число в степени = " +sum);



    }

}
