package Hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static Hometask2.Task2n1.fillArray;

public class Task2n3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Заполните массив числами. Если захотите завершить ввод, нажмите enter:");
        fillArray(arrayList);

        System.out.print("Вывод массива через for: ");
        for (int i = arrayList.size(); i > 0; i--) {
            System.out.print(arrayList.get(i-1) + " ");
        }

        System.out.println("");

        System.out.print("Вывод массива через while: ");
        int i = arrayList.size();
        while (i > 0){
            System.out.print(arrayList.get(i-1) + " ");
            i--;
        }

        System.out.println("");

        System.out.print("Вывод массива через do while: ");
        i = arrayList.size();
        do {
            System.out.print(arrayList.get(i-1) + " ");
            i--;
        } while (i > 0);
    }
}
