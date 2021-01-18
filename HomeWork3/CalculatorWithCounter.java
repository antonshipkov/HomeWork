package HomeWork1.HomeWork3;

public class CalculatorWithCounter {

    private long count = 0;

    private final CalculatorWithOperator calculator1;
    private final CalculatorWithMathCopy calculator2;
    private final CalculatorWithMathExtends calculator3;

    //приниает объекты класса Operator
    public CalculatorWithCounter(CalculatorWithOperator calculator){
        this.calculator1 = calculator;
        this.calculator2 = null;
        this.calculator3 = null;
    }

    //принимает объекты класса MathCopy
    public CalculatorWithCounter(CalculatorWithMathCopy calculator){
        this.calculator1 = null;
        this.calculator2 = calculator;
        this.calculator3 = null;

    }
    // принимает объекты класса Extends, а так же методы родительского класса
    public CalculatorWithCounter(CalculatorWithMathExtends calculator){
        this.calculator1 = null;
        this.calculator2 = null;
        this.calculator3 = calculator;
    }

    //принимает результат метода сложения
    // числа firstnumber на secondnumber родительского класса,
    //считает колличество использований
    public double plus(double firstnumber, double secondnumber) {
        this.count++;
        if (this.calculator1 != null) {
            return this.calculator1.plus(firstnumber, secondnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.plus(firstnumber, secondnumber);
        }
        return this.calculator3.plus(firstnumber, secondnumber);

    }
    //принимает результат метода вычитания
    // числа firstnumber на secondnumber родительского класса,
    //считает колличество использований

    public double minus(double firstnumber, double secondnumber) {
        this.count++;
        if (this.calculator1 != null) {
            return this.calculator1.minus(firstnumber, secondnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.minus(firstnumber, secondnumber);
        }
        return this.calculator3.minus(firstnumber, secondnumber);

    }

    //принимает результат метода умножения числа
    // firstnumber на secondnumber родительского класса,
    //считает колличество использований
    public double multi(double firstnumber, double secondnumber) {
        this.count++;
        if (this.calculator1!= null) {
            return this.calculator1.multi(firstnumber, secondnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.multi(firstnumber, secondnumber);
        }
        return this.calculator3.multi(firstnumber, secondnumber);
    }

    //принимает результат метода деления
    // числа firstnumber на secondnumber родительского класса,
    //считает колличество использований
    public double div(double firstnumber, double secondnumber) {
        this.count++;
        if (this.calculator1!= null) {
            return this.calculator1.div(firstnumber, secondnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.div(firstnumber, secondnumber);
        }
        return this.calculator3.div(firstnumber, secondnumber);
    }

    //принимает результат метода возведения в степень
    // числа firstnumber родительского класса,
    //считает колличество использований
    public double pow(double firstnumber, int secondnumber) {
        this.count++;
        if (this.calculator1!= null) {
            return this.calculator1.pow(firstnumber, secondnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.pow(firstnumber, secondnumber);
        }
        return this.calculator3.pow(firstnumber, secondnumber);
    }

    //принимает результат метода нахождения модуля
    // числа firstnumber родительского класса,
    //считает колличество использований
    public double abs(double firstnumber) {
        this.count++;
        if (this.calculator1!= null) {
            return this.calculator1.abs(firstnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.abs(firstnumber);
        }
        return this.calculator3.abs(firstnumber);
    }

    //принимает результат метода извлечения квадратного корня
    // числа firstnumber родительского класса,
    //считает колличество использований
    public double sqrt(double firstnumber) {
        this.count++;
        if (this.calculator1 != null) {
            return this.calculator1.sqrt(firstnumber);
        }
        else if (this.calculator2 !=null){
            return this.calculator2.sqrt(firstnumber);
        }
        return this.calculator3.sqrt(firstnumber);
    }

    //считаем количество использований калькулятора
    public long getCountOperation() {
        return count;

    }


}
