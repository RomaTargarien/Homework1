package Hometask3.mains;

import Hometask3.Calculators.CalculatorWithMemory;
import Hometask3.Calculators.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(new CalculatorWithOperator());
        calculatorWithMemory.division(28,5);
        calculatorWithMemory.setMemory();
        calculatorWithMemory.degree(calculatorWithMemory.getMemory(),2);
        calculatorWithMemory.setMemory();
        calculatorWithMemory.addition(calculatorWithMemory.getMemory(),calculatorWithMemory.multiplication(15,7));
        calculatorWithMemory.setMemory();
        System.out.println(calculatorWithMemory.addition(4.1,calculatorWithMemory.getMemory()));


    }
}
