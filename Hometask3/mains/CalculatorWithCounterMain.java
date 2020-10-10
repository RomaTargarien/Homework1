package Hometask3.mains;

import Hometask3.Calculators.CalculatorWithCounter;
import Hometask3.Calculators.CalculatorWithOperator;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter counter = new CalculatorWithCounter(new CalculatorWithOperator());
        double multi = counter.multiplication(15,7);
        double sum1 = counter.addition(4.1, multi);
        double div = counter.division(28,5);
        double deg = counter.degree(div,2);
        double sum2 = counter.addition(sum1,deg);
        System.out.println("CalculatorWithCounter: " +sum2);
        System.out.println("Количество раз использований: " + counter.getCounter());
    }
}
