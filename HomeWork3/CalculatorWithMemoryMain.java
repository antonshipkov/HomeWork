package HomeWork1.HomeWork3;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        //находим значение выражения (4.1 + 15 * 7 + (28 / 5) ^ 2)

        CalculatorWithMemory calculator =
                new CalculatorWithMemory(new CalculatorWithOperator());

        calculator.setInMemory(calculator.div(28.0, 5.0));
        calculator.setInMemory(calculator.pow(calculator.getFromMemory(), 2));
        calculator.setInMemory(calculator.plus(calculator.getFromMemory(), calculator.multi(15.0, 7.0)));
        double result = calculator.plus(4.1, calculator.getFromMemory());

        System.out.println("Общая сумма = "+String.format("%.2f",result));


    }
}
