package Hometask3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public double degre(double a, int b){
        return Math.pow(a,b);
    }
    public double modul(double a) { return Math.abs(a); }
    public double sqrt(double a) { return Math.sqrt(a);
    }
}
