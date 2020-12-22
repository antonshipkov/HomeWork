package HomeWork1;

public class HomeWork4_CalculatorWithMathCopy {
    private double firstnumber;
    private double secondnumber;
    private int pow;
    private double thirdnumber;



    public HomeWork4_CalculatorWithMathCopy(){
        this.firstnumber = 0;
        this.secondnumber = 0;
        this.pow = 0;
        this.thirdnumber = 0;

    }
    public HomeWork4_CalculatorWithMathCopy(double firstnumber,double secondnumber,double thirdnumber,int pow){
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

        return  firstnumber * secondnumber;
    }
    public double div(){
        return firstnumber / secondnumber;
    }
    public double pow () {

        return Math.pow(thirdnumber,pow);
    }
    public double abs(){

        return Math.abs(thirdnumber);
    }
    public double sqrt(){
        return Math.sqrt(thirdnumber);
    }


}
