package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;

abstract class Decorator implements ICalc {
    public abstract long getCount();
    public abstract ICalc getCalculator();


}


public class CalculatorWithCounterDecorator extends Decorator {
    private ICalc iCalc;
    private static long count = 0;

    public CalculatorWithCounterDecorator(ICalc iCalc) {
        this.iCalc = iCalc;
    }

    @Override
    public double addition(double a, double b) {
        count++;
        return iCalc.addition(a,b);
    }

    @Override
    public double subtraction(double a, double b) {
        count++;
        return iCalc.subtraction(a,b);
    }

    @Override
    public double multiplication(double a, double b) {
        count++;
        return iCalc.multiplication(a,b);
    }

    @Override
    public double division(double a, double b) {
        count++;
        return iCalc.division(a,b);
    }

    @Override
    public double degree(double a, int b) {
        count++;
        return iCalc.degree(a,b);
    }

    @Override
    public double modul(double a) {
        count++;
        return iCalc.modul(a);
    }

    @Override
    public double sqrt(double a) {
        count++;
        return iCalc.sqrt(a);
    }

    @Override
    public long getCount(){
        return count;
    }

    public ICalc getCalculator(){
        return iCalc;
    }

}


class CalculatorWithMemoryDecorator extends Decorator {
    private ICalc iCalc;
    private double memory = 0;
    private double v = 0;

    public CalculatorWithMemoryDecorator(ICalc iCalc) {
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

    public double getMemory() {
        return memory;
    }
    public void setMemory(){
        this.memory = v;
    }
    public ICalc getCalculator(){
        return iCalc;
    }

    @Override
    public long getCount() {
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        ICalc iCalc = new CalculatorWithCounterDecorator(new CalculatorWithMathExtends());

    }
}
