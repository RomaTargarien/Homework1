package Hometask2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task2n1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Заполните массив числами.");
        int[] array = fillArray();
        System.out.print("Вывод массива через for: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Вывод массива через for each: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Вывод массива через do while: ");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();

        System.out.print("Вывод массива через while: ");
        i = 0;
        while (i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
    }

    // метод заполнения массива произвольной длины с клавиатуры
    public static int[] fillArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сколько хотите ввести элементов в массив");
        int lenght;
        while (true) {
            try {
                lenght = Integer.parseInt(reader.readLine());
                if (lenght <= 0) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Вы ввели неккоректную длину");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Длина не может быть отрицательной или равна нулю");
            }
        }
        System.out.println("Заполните массив числами:");
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++){
            try {
                array[i] = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e){
                System.out.println("Неправда, это не число");
                i--;
            }
        }
        return array;
    }
}
