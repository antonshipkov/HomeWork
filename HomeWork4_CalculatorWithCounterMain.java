package HomeWork1;

public class HomeWork4_CalculatorWithCounterMain {
    public static void main(String[] args) {

        double firstnumber = 15;
        double secondnumber = 7;
        double thirdnumber = 0;
        int pownew = 2;
        int pow =2;
        double k = 28;
        double l = 5;
        double m = 4.1;


        HomeWork4_CalculatorWithCounter sum1 =
                new HomeWork4_CalculatorWithCounter(firstnumber, secondnumber,thirdnumber,pownew,pow);
        double a = sum1.mathcopymulti();
        //System.out.println("Произведение чисел = "+String.format("%.2f",a));

        firstnumber = k;
        secondnumber = l;

        HomeWork4_CalculatorWithCounter sum2 =
                new HomeWork4_CalculatorWithCounter(firstnumber, secondnumber,thirdnumber,pownew,pow);
        double b = sum2.mathcopydiv();
        //System.out.println("Деление = "+String.format("%.2f",b));

        thirdnumber = b;

        HomeWork4_CalculatorWithCounter sum3 =
                new HomeWork4_CalculatorWithCounter(firstnumber, secondnumber,thirdnumber,pownew,pow);
        double c = sum3.mathextendspow();
        //System.out.println("Степень = "+String.format("%.2f",c));


        firstnumber = m;
        secondnumber = a;


        HomeWork4_CalculatorWithCounter sum4 =
                new HomeWork4_CalculatorWithCounter(firstnumber, secondnumber,thirdnumber,pownew,pow);
        double d = sum4.operatoradd();
        //System.out.println("Первая сумма = "+String.format("%.2f",d));

        firstnumber = d;
        secondnumber = c;

        HomeWork4_CalculatorWithCounter sum5 =
                new HomeWork4_CalculatorWithCounter(firstnumber, secondnumber,thirdnumber,pownew,pow);
        double totalsum = sum5.operatoradd();
        System.out.println("Общая сумма = "+String.format("%.2f",totalsum));

        HomeWork4_CalculatorWithCounter countoperation =
                new HomeWork4_CalculatorWithCounter();
        System.out.println("Колличество использований калькулятора CalculatorWithCounter: "
                +countoperation.LonggetCountOperation());


    }

}
