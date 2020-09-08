package Hometask2;

import java.io.IOException;
import java.util.ArrayList;
import static Hometask2.Task2n1.*;
import static Hometask2.BubbleSort.*;

public class BubblesortConsole {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Введите массив чисел, если захотите закончить ввод, нажмите enter:");
        fillArray(array);
        int[] arraycopy = new int[array.size()];
        for (int i = 0; i < array.size(); i++){
            arraycopy[i] = array.get(i);
        }
        print(arraycopy);
        bubbleSort(arraycopy);
        printsort(arraycopy);
    }
}
