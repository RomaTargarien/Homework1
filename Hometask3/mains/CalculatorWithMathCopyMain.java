package Hometask3.mains;

import Hometask3.Calculators.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy copy = new CalculatorWithMathCopy();
        double multi = copy.multiplication(15,7);
        double sum1 = copy.addition(4.1, multi);
        double div =copy.division(28,5);
        double deg = copy.degree(div,2);
        double sum2 = copy.addition(sum1,deg);
        System.out.println("CalculatorWithMathCopy: "+sum2);
    }
}
