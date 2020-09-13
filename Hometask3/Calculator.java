package Hometask3;

public class Calculator {
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
        CalculatorWithMathCopy copy = new CalculatorWithMathCopy();
        double multi2 = copy.multiplication2(15,7);
        double sum01 = copy.addition2(4.1, multi2);
        double div2 =copy.division2(28,5);
        double deg2 = copy.degree2(div2,2);
        double sum02 = copy.addition2(sum01,deg2);
        System.out.println("CalculatorWithMathCopy: "+sum02);

        CalculatorWithMathExtends calcExtend = new CalculatorWithMathExtends();
        double multi3 = calcExtend.multiplication(15,7);
        double sum001 = calcExtend.addition(4.1, multi3);
        double div3 = calcExtend.division(28,5);
        double deg3 = calcExtend.degree(div3,2);
        double sum002 = calcExtend.addition(sum001,deg3);
        System.out.println("CalculatorWithMathExtends: "+sum002);


    }
}
