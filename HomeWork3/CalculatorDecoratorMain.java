package HomeWork1.HomeWork3;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc1 = new CalculatorWithMathExtends();
        ICalculator calc2 = new CalculatorWithMemoryDecorator(calc1);
        ICalculator calc3 = new CalculatorWithCounterDecorator(calc2);

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calc3.plus(calc3.plus(4.1, calc3.multi(15, 7)), calc3.pow(calc3.div(28, 5), 2));
        System.out.println(result);
        System.out.println("количество использований : " + ((CalculatorWithCounterDecorator) calc3).getCount());
        System.out.println("последний результат в памяти: " +
                ((CalculatorWithMemoryDecorator) calc2).getFromMemory());

    }
}
