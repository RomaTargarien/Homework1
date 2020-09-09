package Hometask2;

import java.io.IOException;
import java.util.ArrayList;
import static Hometask2.Task2n1.*;
import static Hometask2.BubbleSort.*;

public class BubblesortConsole {
    public static void main(String[] args) throws IOException {
        int[] array0 = new int[]{9,1,5,99,9,9}; // начало примеров
        print(array0);
        bubbleSort(array0);
        printsort(array0);

        int[] array02 = new int[]{1,1,1,1};
        print(array02);
        bubbleSort(array02);
        printsort(array02);

        int[] array3 = new int[]{};
        print(array3);
        bubbleSort(array3);
        printsort(array3);

        int[] array4 = new int[]{1,2,3,4,5,6};
        print(array4);
        shakerSort(array4);
        printsort(array4); // окончание примеров

        int random = (int) (Math.random()*10); //начало рандома
        int[] array = new int[random];
        fill(array);
        print(array);
        bubbleSort(array);
        printsort(array); //окончание рандома

        ArrayList<Integer> array2 = new ArrayList<>(); //начало ввода с клавиатуры
        System.out.println("Введите массив чисел, если захотите закончить ввод, нажмите enter:");
        fillArray(array2);
        int[] arraycopy = new int[array2.size()];
        for (int i = 0; i < array2.size(); i++){
            arraycopy[i] = array2.get(i);
        }
        print(arraycopy);
        bubbleSort(arraycopy);
        printsort(arraycopy); //окончание ввода с клавиатуры
    }

    // метод заполнения рандомными числами
    public static void fill(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
    }
}

