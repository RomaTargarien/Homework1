package Hometask3.mains;

import Hometask3.Calculators.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double multi = calculator.multiplication(15,7);
        double sum1 = calculator.addition(4.1, multi);
        double div = calculator.division(28,5);
        double deg = calculator.degree(div,2);
        double sum2 = calculator.addition(sum1,deg);
        System.out.println("CalculatorWithOperator: " + sum2);

        double nul = sum2/0;
        System.out.println("Division by zero: "+nul);
        /* исключение не выбрасывается потому что мы имеем дело со значением
        с плавающей точкой. 0 или 0.0d будет являться двойным лителаром и это
        не считается за абсолютный ноль
         */
    }
}
