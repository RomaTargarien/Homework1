package Hometask2;

import java.io.IOException;
import static Hometask2.Task2n1.fillArray;

public class Task2n2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Заполните массив числами.");
        int[] array = fillArray();
        if (array.length == 1){
            System.out.println("Вывод невозможен, у вас только один элемент");
            return;
        }
        System.out.print("Вывод каждого второго элемента массива через for: ");
        for (int i = 1; i < array.length; i = i + 2){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Вывод каждого второго элемента массива через do while: ");
        int i = 1;
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
        System.out.println();

        System.out.print("Вывод каждого второго элемента массива через while: ");
        i = 1;
        while (i < array.length){
            System.out.print(array[i] + " ");
            i += 2;
        }
    }
}
