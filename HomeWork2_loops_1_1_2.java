package HomeWork1;

public class HomeWork2_loops_1_1_2 {

    public static void main(String[]args){

        int n =5;
        System.out.println("Произведение с рекурсией"  +factorial(5));

    }

    private static int factorial(int n) {
        int result = 1;
        if ( n == 0) {
            return result;
        }
        else {
            System.out.println("Число + " +n);
            result = n * factorial(n - 1);
            return result;
        }

    }


}