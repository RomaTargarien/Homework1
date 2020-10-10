package Hometask3.Calculators;

import Hometask3.Interfaces.ICalc;


class CalculatorWithCounterDecorator extends CalculatorWithCounterInterface {
    public ICalc iCalc;

    public CalculatorWithCounterDecorator(ICalc iCalc) {
        super(iCalc);
    }
    public ICalc getCalculator(){
        return iCalc;
    }

}
class CalculatorWithMemoryDecorator extends CalculatorWithMemory{

    public ICalc iCalc;

    public ICalc getCalculator(){
        return iCalc;
    }
    public CalculatorWithMemoryDecorator(ICalc iCalc) {
        super(iCalc);
    }
}
class Main{
    public static void main(String[] args) {
        ICalc iCalc = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        
    }
}
