package Hometask2;

public class Task1n1 {
    public static void main(String[] args) {
        System.out.println("Введите неотрицательное число: ");
        int number = Integer.parseInt(args[0]);
        if (number >= 0) {
            int numberRepeat = number;
            for (int i = 1; i < numberRepeat; i++) {
                number = i * number;
            }
            System.out.println("Ваш ответ:" + number);
        }
        else {
            System.out.println("Введите корректное число");
        }
    }
}
