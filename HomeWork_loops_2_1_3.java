package HomeWork1;
import java.util.Scanner;

public class HomeWork_loops_2_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Число:");
        float num = in.nextFloat();
        int degree;
        do {
            System.out.print("Введите Cтепень: ");
             degree = in.nextInt();
            if (degree < 0) {
                System.out.println("Степень должна быть положительной");
            }
        }while (degree < 0);


        float sum= 1;
        for (int i = 1; i <= degree; i++) {
            sum = sum * num;
        }
        System.out.println("Число в степени = " +sum);



    }

}
