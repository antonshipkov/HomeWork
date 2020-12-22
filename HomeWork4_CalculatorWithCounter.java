package HomeWork1;

public class HomeWork4_CalculatorWithCounter<count> {
    private double firstnumber;
    private double secondnumber;
    private int pow;
    private double thirdnumber;
    private int pownew;
    public static int count = 0;

    public HomeWork4_CalculatorWithCounter() {
        this.firstnumber=0;
        this.secondnumber = 0;
        this.pow = 0;
        this.thirdnumber = 0;
        this.pownew = 0;


    }


    public HomeWork4_CalculatorWithCounter(double firstnumber, double secondnumber,
                                           double thirdnumber, int pow,int pownew) {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
        this.pow = pow;
        this.thirdnumber = thirdnumber;
        this.pownew = pownew;

    }


    public double operatoradd() {

        HomeWork4_CalculatorWithOperator add =
                   new HomeWork4_CalculatorWithOperator(firstnumber,secondnumber,thirdnumber,pow);
        double a = add.add();
        //System.out.println("Сумма = " + String.format("%.2f", a));
        count++;

        return a;
    }

    public double operatorsubs() {



        HomeWork4_CalculatorWithOperator subs = new HomeWork4_CalculatorWithOperator(firstnumber,
                secondnumber,thirdnumber,pow);
        double b = subs.subs();
        //System.out.println("Вычитание = " + String.format("%.2f", b));
        count++;

        return b;
    }

    public double mathcopymulti() {
        HomeWork4_CalculatorWithMathCopy multi = new HomeWork4_CalculatorWithMathCopy(firstnumber,
                secondnumber,thirdnumber,pow);
        double c = multi.multi();
        //System.out.println("Умножение = " + String.format("%.2f", c));
        count++;

        return c;

    }

    public double mathcopydiv() {

        HomeWork4_CalculatorWithMathCopy div = new HomeWork4_CalculatorWithMathCopy(firstnumber,
                secondnumber,thirdnumber,pow);
        double d = div.div();
        //System.out.println("Деление = " + String.format("%.2f", d));
        count++;

        return d;
    }

    public double mathextendspow(){
        HomeWork4_CalculatorWithMathExtends pow = new
            HomeWork4_CalculatorWithMathExtends(firstnumber,
                secondnumber,thirdnumber,pownew);
        double e = pow.pownew();
        //System.out.println("Степень = " + String.format("%.2f", e));
        count++;
        return e;

    }
    public double mathextendsabs() {
        HomeWork4_CalculatorWithMathExtends abs = new
            HomeWork4_CalculatorWithMathExtends(firstnumber,
                secondnumber,thirdnumber,pownew);
        double f = abs.absnew();
        //System.out.println("Модуль = " + String.format("%.2f", f));
        count++;
        return f;
    }

    public double mathextendssqrt() {
        HomeWork4_CalculatorWithMathExtends sqrt = new
                HomeWork4_CalculatorWithMathExtends(firstnumber,
                secondnumber,thirdnumber,pownew);
        double g = sqrt.sqrtnew();
        //System.out.println("Корень = " + String.format("%.2f", g));
        count++;
        return g;
    }

    public static int LonggetCountOperation(){
        int total = count;
        //System.out.println("Колличество "+total);
        return total;
    }



}
