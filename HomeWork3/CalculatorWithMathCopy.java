package HomeWork1.HomeWork3;

public class CalculatorWithMathCopy implements ICalculator {

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

        return  firstnumber * secondnumber;
    }

    //метод выполняет деление числа firstnumber на secondnumber
    public double div(double firstnumber,double secondnumber){

        return firstnumber / secondnumber;
    }

    //метод выполняет возведение числа firstnumber в степень pow
    public double pow (double firstnumber,int pow) {

        return Math.pow(firstnumber,pow);
    }

    //метод возвращает модуль числа firstnumber
    public double abs(double firstnumber){

        return Math.abs(firstnumber);
    }

    //метод извлекает квадратный корень из числа firstnumber
    public double sqrt(double firstnumber){

        return Math.sqrt(firstnumber);
    }


}
