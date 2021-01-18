package HomeWork1.HomeWork3;

public class CalculatorWithCounterInterface {
    private long count = 0;
    private final ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    //принимает результат метода сложения
    // числа firstnumber на secondnumber,
    //считает колличество использований

    public double plus(double firstnumber, double secondnumber) {
        this.count++;
        return this.calculator.plus(firstnumber, secondnumber);
    }

    //принимает результат метода вычитания
    // числа firstnumber на secondnumber,
    //считает колличество использований

    public double minus(double firstnumber, double secondnumber) {
        this.count++;
        return this.calculator.minus(firstnumber, secondnumber);
    }

    //принимает результат метода умножения числа
    // firstnumber на secondnumber,
    //считает колличество использований
    public double multi(double firstnumber, double secondnumber) {
        this.count++;
        return this.calculator.multi(firstnumber, secondnumber);
    }

    //принимает результат метода деления
    // числа firstnumber на secondnumber,
    //считает колличество использований
    public double div(double firstnumber, double secondnumber) {
        this.count++;
        return this.calculator.div(firstnumber, secondnumber);
    }

    //принимает результат метода возведения в степень
    // числа firstnumber,
    //считает колличество использований
    public double pow(double firstnumber, int secondnumber) {
        this.count++;
        return this.calculator.pow(firstnumber, secondnumber);
    }

    //принимает результат метода нахождения модуля
    // числа firstnumber,
    //считает колличество использований
    public double abs(double firstnumber) {
        this.count++;
        return this.calculator.abs(firstnumber);
    }

    //принимает результат метода извлечения квадратного корня
    // числа firstnumber,считает колличество использований
    public double sqrt(double firstnumber) {
        this.count++;
        return this.calculator.sqrt(firstnumber);
    }

    //считаем количество использований калькулятора
    public long getCountOperation() {
        return count;

    }


}
