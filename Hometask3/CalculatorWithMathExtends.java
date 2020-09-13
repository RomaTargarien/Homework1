package Hometask3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public double degree(double a, int b){
        return Math.pow(a,b);
    }
    public double modul(double a) { return Math.abs(a); }
}
