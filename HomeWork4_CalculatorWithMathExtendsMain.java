package HomeWork1;

public class HomeWork4_CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        double firstnumber = 15;
        double secondnumber = 7;
        double thirdnumber = 0;
        int pownew = 2;
        double k = 28;
        double l = 5;
        double m = 4.1;

        HomeWork4_CalculatorWithMathExtends sum1 =
                new HomeWork4_CalculatorWithMathExtends(firstnumber, secondnumber,thirdnumber,pownew);
        double a = sum1.multi();
        //System.out.println("Произведение чисел = "+String.format("%.2f",a));

        firstnumber = k;
        secondnumber = l;

        HomeWork4_CalculatorWithMathExtends sum2 =
                new HomeWork4_CalculatorWithMathExtends(firstnumber, secondnumber,thirdnumber,pownew);
        double b = sum2.div();
        //System.out.println("Деление = "+String.format("%.2f",b));

        thirdnumber = b;

        HomeWork4_CalculatorWithMathExtends sum3 =
                new HomeWork4_CalculatorWithMathExtends(firstnumber, secondnumber,thirdnumber,pownew);
        double c = sum3.pownew();
        //System.out.println("Степень = "+String.format("%.2f",c));


        firstnumber = m;
        secondnumber = a;


        HomeWork4_CalculatorWithMathExtends sum4 =
                new HomeWork4_CalculatorWithMathExtends(firstnumber, secondnumber,thirdnumber,pownew);
        double d = sum4.add();
        //System.out.println("Первая сумма = "+String.format("%.2f",d));

        firstnumber = d;
        secondnumber = c;

        HomeWork4_CalculatorWithMathExtends sum5 =
                new HomeWork4_CalculatorWithMathExtends(firstnumber, secondnumber,thirdnumber,pownew);
        double totalsum = sum5.add();
        System.out.println("Общая сумма = "+String.format("%.2f",totalsum));




    }
}
