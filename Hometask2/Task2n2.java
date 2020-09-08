package Hometask2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2n2 {
    public static void main(String[] args) {
        System.out.println("Введите сколько чисел вы хотите ввести в массив:");
        int number = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Неккоректный ввод. Повторите: ");
            }
        }
        int[] array = new int[number];
        System.out.println("Заполните массив числами");
        for (int i = 0; i < array.length; i++) {
            try {
                Scanner scanner1 = new Scanner(System.in);
                int j = scanner1.nextInt();
                array[i] = j;
            } catch (InputMismatchException e){
                System.out.print("Неккоректный ввод. Повторите: ");
                i--;
            }
        }
        System.out.print("Каждый второй элемент массива: ");
        for (int i = 1; i < array.length; i = i + 2) {
                System.out.print(array[i]+ " ");
        }

    }
}
