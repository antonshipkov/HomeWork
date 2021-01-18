package HomeWork1.HomeWork3;

public class CalculatorWithCounterDecorator implements ICalculator {

    private long counter = 0;

    private final ICalculator calculator;
    public CalculatorWithCounterDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double plus(double firstnumber, double secondnumber) {
        counter++;
        return calculator.plus(firstnumber,secondnumber);
    }

    @Override
    public double minus(double firstnumber, double secondnumber) {
        counter++;
        return calculator.minus(firstnumber, secondnumber);
    }

    @Override
    public double multi(double firstnumber, double secondnumber) {
        counter++;
        return calculator.multi(firstnumber, secondnumber);
    }

    @Override
    public double div(double firstnumber, double secondnumber) {
        counter++;
        return calculator.div(firstnumber, secondnumber);
    }

    @Override
    public double pow(double firstnumber, int secondnumber) {
        counter++;
        return calculator.pow(firstnumber,secondnumber);
    }

    @Override
    public double abs(double firstnumber) {
        counter++;
        return calculator.abs(firstnumber);
    }

    @Override
    public double sqrt(double firstnumber) {
        counter++;
        return calculator.sqrt(firstnumber);
    }
    public long getCount(){
        return counter;
    }
    public ICalculator getCalculator(){
        return calculator;
    }

}


