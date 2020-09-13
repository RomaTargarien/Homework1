package Hometask3;
/*Создать класс CalculatorWithCounter, все методы в данном классе НЕ статические.
У данного класса должно быть три конструктора (или один если сможете, это ещё не изучено
https://refactoring.guru/ru/design-patterns/decorator)
один принимающий в себя CalculatorWithOperator, второй CalculatorWithMathCopy, третий CalculatorWithMathExtends.
Данные конструкторы должны сохранять переданные калькуляторы в приватные поля класса для дальнейшего их использования.
Он также имеет 7 методов как и другие калькуляторы + 1 метод getCountOperation() который должен
вернуть значение внутреннего счётчика.
В реализации методов должен быть вызван один из объектов переданный в констуктор при создании объекта
CalculatorWithCounter, и вызвать соответсвующий метод у них.
К примеру. Если вызывают метод plus у CalculatorWithCounter то он должен вызвать метод plus у объекта
CalculatorWithOperator или у объекта CalculatorWithMathCopy или у объекта  CalculatorWithMathExtends
(смотря что передали в конструктор) и увеличить значение внутреннего счётчика операций.*/

public class CalculatorWithCounter {
    private CalculatorWithMathCopy copy;
    private CalculatorWithOperator operator;
    private CalculatorWithMathExtends mathExtends;
    private static double count = 0;

    public CalculatorWithCounter(CalculatorWithMathCopy copy){
        this.copy = copy;
    }
    public CalculatorWithCounter(CalculatorWithOperator operator){
        this.operator = operator;
    }
    public CalculatorWithCounter(CalculatorWithMathExtends mathExtends){
        this.mathExtends = mathExtends;
    }

    public static void main(String[] args) {
        CalculatorWithMathCopy mathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounter counter = new CalculatorWithCounter(mathCopy);

    }
    public double addition2(double a, double b){
        return a + b;
    }
    public double subtraction2(double a, double b){
        return a - b;
    }
    public double multiplication2(double a, double b){
        return a*b;
    }
    public double division2(double a, double b){
        return a/b;
    }
    public double degree2(double a, int b){
        return Math.pow(a,b);
    }
    public double modul2(double a){
        return Math.abs(a);
    }
    public double radical2(double a, double b){
        return Math.pow(a,b);
    }

    public static double getCount() {
        return count;
    }
}
