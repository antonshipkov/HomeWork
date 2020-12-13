package HomeWork1;

import java.util.Arrays;

public class HomeWork1_6 {
    public static void main(String[] args) {
        String numbers = createPhoneNumber("1 2 3 4 5 6 7 8 9 0");

    }

    public static String createPhoneNumber( String numbers) {
        String[] strArr;
        strArr = numbers.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println("(" +numArr[0]+numArr[1]+numArr[2]+")"+numArr[3]+numArr[4]+
                numArr[5]+"-"+numArr[6]+numArr[7]+numArr[8]+numArr[9]);

        return numbers;
    }
}
