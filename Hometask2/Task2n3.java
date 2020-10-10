package Hometask2;


import java.io.IOException;
import static Hometask2.Task2n1.fillArray;

public class Task2n3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Заполните массив числами.");
        int[] array = fillArray();

        System.out.print("Вывод массива с конца через for: ");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Вывод массива с конца через do while: ");
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        System.out.print("Вывод каждого второго элемента массива через while: ");
        i = array.length - 1;
        while (i >= 0){
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
