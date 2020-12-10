package HomeWork1; //доделал 2.4.6-сумму цифр, не успел
                   //  не сделал 2.4.5. не понимаю как добавить ряд внутрь рандомного
import java.util.Arrays;
import java.util.Random;

public class HomeWork1_arrays_2_4 {
    public static void main(String[] args) {

        int[] container1 = arrayRandom1(5, 100);
        int[] container2 = arrayRandom2(5, 100);
        int[] container3 = arrayRandom3(5, 100);
        int[] container4 = arrayRandom4(5, 100);
        int[] container5 = arrayRandom5(5, 100);


    }

    public static int[] arrayRandom1(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();
        System.out.print("Случайный массив чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
            System.out.print(array[i] + "   ");

        }

        System.out.println();
        int sum=0;
        System.out.print("Положительные четные элементы: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0){
                sum = sum + array[i];
                System.out.print(array[i] +  "   ");
            }

        }
        System.out.println();
        System.out.println("Сумма четных положительных элементов массива  =  " + sum);
        return array;
    }

    public static int[] arrayRandom2(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();
        System.out.print("Случайный массив чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
            System.out.print(array[i] + "   ");

        }

        System.out.println();
        int max=0;
        for (int i = 1; i < array.length; i+=2) {
            if (array[i] > array[max]) {
                array[max] = array[i];

            }

        }
        System.out.println("Максимальный элемент с четным индексом:   " +array[max]);

        return array;
    }
    public static int[] arrayRandom3(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();
        System.out.print("Случайный массив чисел: ");
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
            System.out.print(array[i] + "   ");
            sum = sum+array[i];

        }
        System.out.println();
        System.out.println("Сумма элементов = " + sum);
        double med=sum/size;
        System.out.println("Среднее арефметическое = " + med);
        System.out.print("Элементы массива меньше среднеарифметического:  ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] < med) {
                System.out.print(array[i] + "   ");


            }
        }

        return array;
    }

    public static int[] arrayRandom4(int size, int maxValueExclusion) {

        int[] array = new int[size];
        Random rand = new Random();
        System.out.println();
        System.out.print("Случайный массив чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        int min1=0;
        int min2=0;
        int b =0;
        if (array[0]>array[1]) {
            min1 = array[0];
            min2 = array[1];
        }
        else{
            min1 = array[1];
            min2 = array[0];
        }

        for (int i = 3; i < array.length; i++) {
            if (array[i] < min1) {
                array[b] = min1;
                min1 = array[i];
                if (array[b] < min2) {
                    min2 = array[b];
                }

            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }

        System.out.println("Первое меньшее:  "+ min1);
        System.out.println("Второе меньшее:  "+ min2);
        return array;
    }

    public static int[] arrayRandom5(int size, int maxValueExclusion) {

        int[] array = new int[size];
        Random rand = new Random();

        System.out.print("Случайный массив чисел: ");
        int number_create;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
            System.out.print(array[i] + "   ");
            for (;array[i]>0;array[i]/=10){
                number_create = array[i]%10;
                sum = sum + number_create;
            }
        }
        System.out.println();
        System.out.println(" Сумма чисел = " +sum);


        System.out.println();

        return array;
    }


}
