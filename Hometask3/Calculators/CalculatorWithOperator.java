package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;

public class CalculatorWithOperator implements ICalc {
    public double addition(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return a - b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double degree(double a, int b){
        if (b == 0){
            return 1;
        }
        double c = a;
        if (b < 0){
            for (int i = 1; i < -b; i++) {
                a = a * c;
            }
            return 1 / a;
        } else {
                for (int i = 1; i < b; i++) {
                    a = a * c;
                }
            return a;
        }
    }
    public double modul(double a){
        if (a >= 0) return a;
        else return -a;
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
