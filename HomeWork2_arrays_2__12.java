package HomeWork1;
import java.util.Scanner;
public class HomeWork2_arrays_2__12 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        int[] container2 = arrayFromConsole2();
        int[] container3 = arrayFromConsole3();

    }

    public static int[] arrayFromConsole() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Введенные элементы массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        return array;
    }

    public static int[] arrayFromConsole2() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Вторые элементы массива:");
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        return array;
    }

    public static int[] arrayFromConsole3() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Введенные элементы массива в обратном порядке:");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(" " +array[i]);
        }

        System.out.println();

        return array;
    }




}







