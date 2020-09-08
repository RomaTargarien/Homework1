package Hometask2;

public class Task1n4 {
    public static void main(String[] args) {
        long i = 1;
        long i2 = i;
        int count = 0;
        while (i > 0){
            i = i * 3;
            if (i < 0){
                for (int b = 0; b < count; b++)
                i2 = i2 * 3;
                System.out.println("До переполнения: " + i2);
                break;
            }
            count++;
        }
        System.out.println("После переполнения: " + i);

    }
}
