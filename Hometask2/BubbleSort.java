package Hometask2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{9,1,5,99,9,9};
        print(array);
        bubbleSort(array);
        printsort(array);

        int[] array2 = new int[]{1,1,1,1};
        print(array2);
        bubbleSort(array2);
        printsort(array2);

        int[] array3 = new int[]{};
        print(array3);
        bubbleSort(array3);
        printsort(array3);

        int[] array4 = new int[]{1,2,3,4,5,6};
        print(array4);
        bubbleSort(array4);
        printsort(array4);

    }
    public static void bubbleSort(int[] arraycopy){
        for (int i = arraycopy.length - 1; i >=1; i--){
            for (int j = 0; j < i; j++){
                if (arraycopy[j] > arraycopy[j+1]){
                    swap( j, j+1, arraycopy);
                }
            }
        }
    }
    public static void swap(int number1, int number2, int[] array){
        int numbercopy = array[number1];
        array[number1] = array[number2];
        array[number2] = numbercopy;
    }
    public static void print(int[] array){
        System.out.print("Неотсортированный массив чисел: ");
        for (int value : array) {
            System.out.print(+ value + " ");
        }
        System.out.println();
    }
    public static void printsort(int[] array){
        System.out.print("Oтсортированный массив чисел: ");
        for (int value : array) {
            System.out.print(+ value + " ");
        }
        System.out.println();
    }
}
