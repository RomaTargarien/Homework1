package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;

public class CalculatorWithMathCopy implements ICalc {
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
        return Math.pow(a,b);
    }
    public double modul(double a){ return Math.abs(a); }
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}

