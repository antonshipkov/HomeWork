package HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2_sorts_main<array> {
    public static void main(String[] args) {


        int[] arrays1 = new int[]{1,2,3,4,5,6};
        int[] arrays2 = new int[]{1,1,1,1};
        int[] arrays3 = new int[]{9,1,5,99,9,9};
        int[] arrays4 = new int[10];
        int[] bubble = arrayRandom (5, 100);
        int[] shaker = arrayRandom (10, 100);
        int[] bubbleconsole = arrayFromConsole();
        int[] shakerconsole = arrayFromConsole();




        System.out.println("Массив до сортировки: "+ Arrays.toString(arrays1));
        HomeWork2_sorts_methods sorts1 = new HomeWork2_sorts_methods(arrays1);
        arrays1 = sorts1.bubbleSort();
        System.out.println("Массив после сортировки пузырьком: "+ Arrays.toString(arrays1));
        arrays1 = sorts1.Shaker();
        System.out.println("Массив после сортировки шейкером: "+ Arrays.toString(arrays1));

        System.out.println();

        System.out.println("Массив до сортировки: "+ Arrays.toString(arrays2));
        HomeWork2_sorts_methods sorts2 = new HomeWork2_sorts_methods(arrays2);
        arrays2 = sorts2.bubbleSort();
        System.out.println("Массив после сортировки пузырьком: "+ Arrays.toString(arrays2));
        arrays2 = sorts2.Shaker();
        System.out.println("Массив после сортировки шейкером: "+ Arrays.toString(arrays2));

        System.out.println();

        System.out.println("Массив до сортировки: "+ Arrays.toString(arrays3));
        HomeWork2_sorts_methods sorts3 = new HomeWork2_sorts_methods(arrays3);
        arrays3 = sorts3.bubbleSort();
        System.out.println("Массив после сортировки пузырьком: "+ Arrays.toString(arrays3));
        arrays3 = sorts3.Shaker();
        System.out.println("Массив после сортировки шейкером: "+ Arrays.toString(arrays3));

        System.out.println();

        System.out.println("Массив до сортировки: "+ Arrays.toString(arrays4));
        HomeWork2_sorts_methods sorts4 = new HomeWork2_sorts_methods(arrays4);
        arrays4 = sorts4.bubbleSort();
        System.out.println("Массив после сортировки пузырьком: "+ Arrays.toString(arrays4));
        arrays4 = sorts4.Shaker();
        System.out.println("Массив после сортировки шейкером: "+ Arrays.toString(arrays4));

        System.out.println();

        System.out.println("Первоначальный рандомный массив: "+ Arrays.toString(bubble));
        HomeWork2_sorts_methods sorts5 = new HomeWork2_sorts_methods(bubble);
        bubble = sorts5.bubbleSort();
        System.out.println("Отсортированные элементы рандомного массива пузырьком: " + Arrays.toString(bubble));

        System.out.println();

        System.out.println("Первоначальный рандомный массив: "+ Arrays.toString(shaker));
        HomeWork2_sorts_methods sorts6 = new HomeWork2_sorts_methods(shaker);
        shaker = sorts6.Shaker();
        System.out.println("Отсортированные элементы рандомного массива шейкером: " + Arrays.toString(shaker));

        System.out.println();

        System.out.println("Первоначальный массив c консоли: "+ Arrays.toString(bubbleconsole));
        HomeWork2_sorts_methods sorts7 = new HomeWork2_sorts_methods(bubbleconsole);
        bubbleconsole = sorts7.bubbleSort();
        System.out.println("Отсортированные элементы массива с консоли пузырьком: " + Arrays.toString(bubbleconsole));

        System.out.println();

        System.out.println("Первоначальный массив c консоли: "+ Arrays.toString(shakerconsole));
        HomeWork2_sorts_methods sorts8 = new HomeWork2_sorts_methods(shakerconsole);
        shakerconsole = sorts8.Shaker();
        System.out.println("Отсортированные элементы массива с консоли пузырьком: " + Arrays.toString(shakerconsole));

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);

        }

        return array;
    }

    public static int[] arrayFromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }

}
