package HomeWork1;



public class HomeWork4_CalculatorWithOperator {
    private double firstnumber;
    private double secondnumber;
    private int pow;
    private double thirdnumber;



    public HomeWork4_CalculatorWithOperator(){
        this.firstnumber = 0;
        this.secondnumber = 0;
        this.pow = 0;
        this.thirdnumber = 0;

    }
    public HomeWork4_CalculatorWithOperator(double firstnumber,double secondnumber,double thirdnumber,int pow){
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
        this.pow = pow;
        this.thirdnumber = thirdnumber;

    }
    public double add(){

        return firstnumber + secondnumber;
    }
    public double subs(){

        return firstnumber - secondnumber;
    }
    public double multi(){

        return firstnumber * secondnumber;
    }
    public double div(){
        return firstnumber / secondnumber;
    }
    public double pow () {
        double result = 1;

        for (int i = 1; i <= pow; i++) {
            result = result * thirdnumber;
        }
        return result;
    }
    public double abs(){

        return (thirdnumber <= 0.0D) ? 0.0D - thirdnumber : thirdnumber;
    }
    public double sqrt(){

        return Math.sqrt(thirdnumber);
    }

}
