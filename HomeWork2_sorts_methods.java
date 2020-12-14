package HomeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2_sorts_methods {
    private int[]array;

    public HomeWork2_sorts_methods (int []array){
        this.array = array;
    }
    public int[] bubbleSort(){
        int[]newArray = array;
        int count;
        do {
            count = 0;
            for(int i =0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }
        while (count >0);
        return array;
    }
    public int[] Shaker(){

        int left = 1;
        int right = array.length-1;
        do {
            for(int i = right; i >= left; i--) {
                if (array[i-1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
            for(int i = left;i <= right;i++){
                if (array[i-1] > array[i]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            right--;
        }
        while(left <= right);
        return array;
    }
}
