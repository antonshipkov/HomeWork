package HomeWork1.HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

       //убрал лишние переменные, передал числа напрямую в методы
        // класса CalculatorWithOperator

        //находим значение выражения (4.1 + 15 * 7 + (28 / 5) ^ 2)

        CalculatorWithOperator calculator =
                new CalculatorWithOperator();

        double a = calculator.div(28,5);
        double b = calculator.pow(a,2);
        double c = calculator.multi(15,7);
        double plus = calculator.plus(4.1,c);
        double total = calculator.plus(plus,b);
        System.out.println("Общая сумма = "+String.format("%.2f",total));

    }
}

