package HomeWork1;

public class HomeWork4_CalculatorWithMathExtends extends HomeWork4_CalculatorWithOperator {

    private double firstnumber;
    private double secondnumber;
    private double thirdnumber;
    private int pow;

    public HomeWork4_CalculatorWithMathExtends(double firstnumber, double secondnumber, double thirdnumber, int pow) {
        super(firstnumber, secondnumber, thirdnumber, pow);
    }

    public HomeWork4_CalculatorWithMathExtends() {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
        this.thirdnumber = thirdnumber;
        this.pow = pow;

    }


    public double pownew() {
        double pownew = pow();

        return pownew;
    }

    public double absnew() {
        double absnew = abs();

        return absnew;
    }

    public double sqrtnew(){
        double sqrtnew = sqrt();
        return sqrtnew;
    }

}

