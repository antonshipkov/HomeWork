package HomeWork1;

public class HomeWork2_loops_1_1_1 {

    public static void main(String[] args) {
        int sum = 1;
        int max = 5;

        for (int i = 1;i<=max - 1;i++){
            System.out.print(i+" * " );
        }

        for (int i = 1;i<=max;i++){
            sum=sum*i;
        }

        System.out.println(max+ " = " +sum);

    }

}