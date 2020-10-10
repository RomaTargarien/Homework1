package Hometask2;

import java.io.IOException;
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

        System.out.println("Заполните массив:");
        int[] arrayCreateByYourSelf = fillArray();//начало ввода с клавиатуры
        print(arrayCreateByYourSelf);
        bubbleSort(arrayCreateByYourSelf);
        printsort(arrayCreateByYourSelf); //окончание ввода с клавиатуры
    }

    // метод заполнения рандомными числами
    public static void fill(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
    }
}

