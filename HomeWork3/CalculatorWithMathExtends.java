package HomeWork1.HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    //Убрал не нужные строки с переменными private, оставил только методы Math
    //Методы сложения,вычитания,умножения и деления наследуются из родительского класса

    //метод выполняет возведение числа firstnumber в степень pow
    public double pow(double first, int pow) {

        return Math.pow(first,pow);
    }

    //метод возвращает модуль числа firstnumber
    public double abs(double firstnumber) {

        return Math.abs(firstnumber);
    }

    //метод извлекает квадратный корень из числа firstnumber
    public double sqrt(double firstnumber){

        return Math.sqrt(firstnumber);
    }

}

