package Hometask2;

import java.util.Scanner;

public class Task1n3 {
    public static void main(String[] args) {
        System.out.print("Введите число, которое будем возводить в степень: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double pow;
        while (true) {
            System.out.print("Введите положительное число, которое будет степенью: ");
            pow = scanner.nextDouble();
            if (pow > 0) break;
        }
        double result =  Math.pow(number,pow);
        System.out.println("Ответ: " + result);
    }
}
