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

public class CalculatorWithCounter implements ICalcCounter, IMemory{

    private final ICalc iCalc;
    private int counter = 0;
    private double memory = 0;

    public CalculatorWithCounter(ICalc iCalc) {
        this.iCalc = iCalc;
    }
    public double addition(double a, double b){
        counter++;
        memory = iCalc.addition(a,b);
        return iCalc.addition(a,b);
    }
    public double subtraction(double a, double b){
        memory = iCalc.subtraction(a,b);
        counter++;
        return iCalc.subtraction(a,b);
    }
    public double multiplication(double a, double b){
        memory = iCalc.multiplication(a,b);
        counter++;return iCalc.multiplication(a,b);
    }
    public double division(double a, double b){
        memory = iCalc.division(a,b);
        counter++;return iCalc.division(a,b); }
    public double degree(double a, int b){
        memory = iCalc.degree(a,b);
        counter++;return iCalc.degree(a,b);
    }
    public double modul(double a){
        memory = iCalc.modul(a);
        counter++;return iCalc.modul(a);
    }
    public double sqrt(double a) {
        memory = iCalc.sqrt(a);
        counter++;return iCalc.sqrt(a);
    }
    public int getCounter() {
        return counter;
    }

    @Override
    public double memory() {
        return memory;
    }
}
