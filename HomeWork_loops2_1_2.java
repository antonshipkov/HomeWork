package HomeWork1;

public class HomeWork_loops2_1_2 {
    public static void main(String[] args) {
        int number = recursion(12345);
        int number_create;
        int sum = 1;
        for (;number>0;number /=10){
            number_create = number%10;
            sum = sum * number_create;
        }
        System.out.println(" = " +sum);

    }

    public static int recursion(int number) {

        if (number > 0) {
            recursion(number / 10);
            System.out.printf(" %d  ", (number % 10));
        }

        return number;
    }

}
