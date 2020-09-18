package Hometask3;

public class CalculatorMain {
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
        double multi2 = copy.multiplication(15,7);
        double sum01 = copy.addition(4.1, multi2);
        double div2 =copy.division(28,5);
        double deg2 = copy.degree(div2,2);
        double sum02 = copy.addition(sum01,deg2);
        System.out.println("CalculatorWithMathCopy: "+sum02);

        CalculatorWithMathExtends calcExtend = new CalculatorWithMathExtends();
        double multi3 = calcExtend.multiplication(15,7);
        double sum001 = calcExtend.addition(4.1, multi3);
        double div3 = calcExtend.division(28,5);
        double deg3 = calcExtend.degree(div3,2);
        double sum002 = calcExtend.addition(sum001,deg3);
        System.out.println("CalculatorWithMathExtends: "+sum002);

        CalculatorWithCounter counter = new CalculatorWithCounter(new CalculatorWithOperator());
        System.out.println(counter.addition(10,19));
        System.out.println(counter.degree(2,6));
        System.out.println(counter.getCounter());

        Chemist<CalculatorWithMathCopy> chemist = new Chemist<>(new CalculatorWithMathCopy());
        System.out.println(chemist.getIcalc().modul(-3));

        counter.addition(4,7);
        double c = counter.memory();
        counter.subtraction(3,10);
        double d = counter.memory();
        System.out.println(d + " " + c);



    }
}
