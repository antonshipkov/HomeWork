package HomeWork1;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2_arrays_2_3 {
    public static void main(String[] args) {

        int[] container = arrayRandom(5, 100);

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
            System.out.print(array[i] + "   ");
        }
        return array;
    }


}




