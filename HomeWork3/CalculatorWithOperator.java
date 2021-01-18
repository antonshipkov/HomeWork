package HomeWork1.HomeWork3;



public class CalculatorWithOperator implements ICalculator {
    //Убрал не нужные строки с переменными private,
    // каждый метод принимает две переменные
    //из четырех переменных оставил три, thirdnumber убрал, т.к. она не нужна

     //метод выполняет сложение числа firstnumber на secondnumber
    public double plus(double firstnumber,double secondnumber){
            return firstnumber + secondnumber;
    }

    //метод выполняет вычитание числа firstnumber на secondnumber
    public double minus(double firstnumber,double secondnumber){
        return firstnumber - secondnumber;
    }

    //метод выполняет умножение числа firstnumber на secondnumber
    public double multi(double firstnumber,double secondnumber){
        return firstnumber * secondnumber;
    }

    //метод выполняет деление числа firstnumber на secondnumber
    public double div(double firstnumber,double secondnumber){
        return firstnumber / secondnumber;
    }

    //метод выполняет возведение числа firstnumber в степень pow
    public double pow (double firstnumber,int pow) {
        double result = 1;

        for (int i = 1; i <= pow; i++) {
            result = result * firstnumber;
        }
        return result;
    }

    //метод возвращает модуль числа firstnumber
    public double abs(double firstnumber){

        return (firstnumber <= 0.0D) ? 0.0D - firstnumber : firstnumber;
    }

    //метод извлекает квадратный корень из числа firstnumber
    public double sqrt(double firstnumber){

        return Math.sqrt(firstnumber);
    }

}
