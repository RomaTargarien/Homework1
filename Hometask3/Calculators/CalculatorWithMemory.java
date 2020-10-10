package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;
import Hometask3.Interfaces.IMemory;

public class CalculatorWithMemory implements ICalc, IMemory {
    private final ICalc iCalc;
    private double memory = 0;

    public CalculatorWithMemory(ICalc iCalc) {
        this.iCalc = iCalc;
    }
    public double addition(double a, double b){
        memory = iCalc.addition(a,b);
        return iCalc.addition(a,b);
    }
    public double subtraction(double a, double b){
        memory = iCalc.subtraction(a,b);
        return iCalc.subtraction(a,b);
    }
    public double multiplication(double a, double b){
        memory = iCalc.multiplication(a,b);
        return iCalc.multiplication(a,b);
    }
    public double division(double a, double b){
        memory = iCalc.division(a,b);
        return iCalc.division(a,b); }
    public double degree(double a, int b){
        memory = iCalc.degree(a,b);
        return iCalc.degree(a,b);
    }
    public double modul(double a){
        memory = iCalc.modul(a);
        return iCalc.modul(a);
    }
    public double sqrt(double a) {
        memory = iCalc.sqrt(a);
        return iCalc.sqrt(a);
    }

    @Override
    public double getMemory() {
        return memory;
    }
    public void setMemory(){
        this.memory = memory;
    }
}
