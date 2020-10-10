package Hometask3.mains;

import Hometask3.Calculators.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcExtend = new CalculatorWithMathExtends();
        double multi = calcExtend.multiplication(15,7);
        double sum1 = calcExtend.addition(4.1, multi);
        double div = calcExtend.division(28,5);
        double deg = calcExtend.degree(div,2);
        double sum2 = calcExtend.addition(sum1,deg);
        System.out.println("CalculatorWithMathExtends: "+sum2);
    }
}
