package Hometask2;

public class BubbleSort {
    // метод пузырьковой сортировки
    public static void bubbleSort(int[] arraycopy){
        for (int i = arraycopy.length - 1; i >=1; i--){
            for (int j = 0; j < i; j++){
                if (arraycopy[j] > arraycopy[j+1]){
                    swap( j, j+1, arraycopy);
                }
            }
        }
    }
    // метод шейкерной сортировки
    public static void shakerSort(int[] arraycopy){
        for (int i = arraycopy.length - 1; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                if (arraycopy[j] > arraycopy[j + 1]) {
                    swap(j, j + 1, arraycopy);
                }
            }
            if (arraycopy[i] < arraycopy[i-1]){
                swapReturn(i-1,i,arraycopy);
            }
        }
    }

    // метод перестановки чисел (слева направо)
    public static void swap(int number1, int number2, int[] array){
        int numbercopy = array[number1];
        array[number1] = array[number2];
        array[number2] = numbercopy;
    }

    // метод перестановки чисел (справа налево)
    public static void swapReturn(int bigNumber, int smallNumber, int[] array){
        int numbercopy = array[bigNumber];
        array[bigNumber] = array[smallNumber];
        array[smallNumber] = numbercopy;
    }

    // печать неотсортированного массива
    public static void print(int[] array){
        System.out.print("Неотсортированный массив чисел: ");
        for (int value : array) {
            System.out.print(+ value + " ");
        }
        System.out.println();
    }

    //печать сортированного массива
    public static void printsort(int[] array){
        System.out.print("Oтсортированный массив чисел: ");
        for (int value : array) {
            System.out.print(+ value + " ");
        }
        System.out.println();
    }
}
