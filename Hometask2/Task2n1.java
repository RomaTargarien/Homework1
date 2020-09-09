package Hometask2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Task2n1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Заполните массив числами. Если захотите завершить ввод, нажмите enter:");
        fillArray(arrayList);

        System.out.print("Вывод массива через for: ");
        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println("");

        System.out.print("Вывод массива через for each: ");
        for (int i : arrayList) {
            System.out.print(i + " ");
        }

        System.out.println("");

        int i = 0;
        System.out.print("Вывод массива через while: ");
        while (i <= (arrayList.size() - 1)){
            System.out.print(arrayList.get(i) + " ");
            i++;
        }
        i = 0;

        System.out.println("");

        System.out.print("Вывод массива через do while: ");
        do {
            System.out.print(arrayList.get(i) + " ");
            i++;
        } while (i <= arrayList.size() - 1);
        

    }

    // метод заполнения массива произвольной длины с клавиатуры
    public static void fillArray(ArrayList<Integer> arrayList) throws IOException {
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
    }
}
