package Hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2n3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Заполните массив числами. Если захотите завершить ввод, нажмите enter:");

        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = reader.readLine();
            if (string.equals("")){
                break;
            } else {
                try {
                    int j = Integer.parseInt(string);
                    arrayList.add(j);
                } catch (NumberFormatException e){
                    System.out.println("Вы ввели не число и не enter. Повторите ввод:");
                }
            }
        }
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
