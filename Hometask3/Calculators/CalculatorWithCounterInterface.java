package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;
import Hometask3.Interfaces.ICalcCounter;

public class CalculatorWithCounterInterface implements ICalc, ICalcCounter {
    private final ICalc iCalc;
    private int counter = 0;

    public CalculatorWithCounterInterface(ICalc iCalc) {
        this.iCalc = iCalc;
    }
    public double addition(double a, double b){
        counter++;
        return iCalc.addition(a,b);
    }
    public double subtraction(double a, double b){
        counter++;
        return iCalc.subtraction(a,b);
    }
    public double multiplication(double a, double b){
        counter++;
        return iCalc.multiplication(a,b);
    }
    public double division(double a, double b){
        counter++;
        return iCalc.division(a,b); }
    public double degree(double a, int b){
        counter++;
        return iCalc.degree(a,b);
    }
    public double modul(double a){
        counter++;
        return iCalc.modul(a);
    }
    public double sqrt(double a) {
        counter++;
        return iCalc.sqrt(a);
    }
    public int getCounter() {
        return counter;
    }
}
