package HomeWork1.HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        //убрал лишние переменные, передал числа напрямую в методы
        // класса CalculatorWithMathExtends

        CalculatorWithMathExtends calculator =
                new CalculatorWithMathExtends();

        double a = calculator.div(28,5);
        //System.out.println("Деление 28/5 = "+String.format("%.2f",a));

        double b = calculator.pow(a,2);
        //System.out.println("Степень = "+String.format("%.2f",b));

        double c = calculator.multi(15,7);
       // System.out.println("Произведение = "+String.format("%.2f",c));

        double plus = calculator.plus(4.1,c);
        //System.out.println("Первая сумма = "+String.format("%.2f",plus));

        double total = calculator.plus(plus,b);
        System.out.println("Общая сумма = "+String.format("%.2f",total));

    }


}
