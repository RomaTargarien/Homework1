package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;
import Hometask3.Interfaces.IMemory;

public class CalculatorWithMemory implements ICalc, IMemory {
    private final ICalc iCalc;
    private double memory = 0;
    private double v = 0;

    public CalculatorWithMemory(ICalc iCalc) {
        this.iCalc = iCalc;
    }
    public double addition(double a, double b){
        v = iCalc.addition(a,b);
        return v;
    }
    public double subtraction(double a, double b){
        v = iCalc.subtraction(a,b);
        return v;
    }
    public double multiplication(double a, double b){
        v = iCalc.multiplication(a,b);
        return v;
    }
    public double division(double a, double b){
        v = iCalc.division(a,b);
        return v;
    }
    public double degree(double a, int b){
        v = iCalc.degree(a,b);
        return v;
    }
    public double modul(double a){
        v = iCalc.modul(a);
        return v;
    }
    public double sqrt(double a) {
        v = iCalc.sqrt(a);
        return v;
    }

    @Override
    public double getMemory() {
        return memory;
    }
    public void setMemory(){
        this.memory = v;
    }
}
