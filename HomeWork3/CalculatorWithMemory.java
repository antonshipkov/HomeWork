package HomeWork1.HomeWork3;

//наследуем математические методы из родительского класса
public class CalculatorWithMemory extends CalculatorWithOperator {
    CalculatorWithOperator calculator;
    final double result = 0;
    private double memoryVar = 0;

    public CalculatorWithMemory(CalculatorWithOperator calculator){
        this.calculator = calculator;
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


