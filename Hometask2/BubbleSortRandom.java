package Hometask2;

import java.util.Random;

import static Hometask2.BubbleSort.*;

public class BubbleSortRandom {
    public static void main(String[] args) {
        int random = (int) (Math.random()*10);
        int[] array = new int[random];
        fill(array);
        print(array);
        bubbleSort(array);
        printsort(array);
    }
    public static void fill(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
    }
}
