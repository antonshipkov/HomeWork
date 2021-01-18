package HomeWork1.HomeWork3;

public class CalculatorWithMemoryDecorator implements ICalculator {

    final double result = 0;
    private double memoryVar = 0;

    private final ICalculator calculator;
    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double plus(double firstnumber, double secondnumber) {
        return calculator.plus(firstnumber,secondnumber);
    }

    @Override
    public double minus(double firstnumber, double secondnumber) {
        return calculator.minus(firstnumber, secondnumber);
    }

    @Override
    public double multi(double firstnumber, double secondnumber) {
        return calculator.multi(firstnumber, secondnumber);
    }

    @Override
    public double div(double firstnumber, double secondnumber) {
        return calculator.div(firstnumber, secondnumber);
    }

    @Override
    public double pow(double firstnumber, int secondnumber) {
        return calculator.pow(firstnumber,secondnumber);
    }

    @Override
    public double abs(double firstnumber) {
        return calculator.abs(firstnumber);
    }

    @Override
    public double sqrt(double firstnumber) {
        return calculator.sqrt(firstnumber);
    }

    public ICalculator getCalculator(){
        return calculator;

    }
    //записываем в память результат последнего вызванного метода
    public void setInMemory(double result){
        memoryVar = result;
    }

    //получаем из памяти значение, память стирается
    public double getFromMemory(){
        double var = memoryVar;
        memoryVar = 0;
        return var;
    }

}


