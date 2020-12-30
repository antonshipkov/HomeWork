package HomeWork1;

public class HomeWork2_loops_1_1_2 {

    public static void main(String[]args){

        int max =5;
        for (int i = 1;i<=max - 1;i++) {
            System.out.print(i + " * ");
        }
        System.out.print(max);
        System.out.print(" = "  +factorial(max));

    }

    private static int factorial(int n) {
        int result = 1;
        if ( n == 0) {
            return result;
        }
        else {
            result = n * factorial(n - 1);
            return result;
        }

    }
}