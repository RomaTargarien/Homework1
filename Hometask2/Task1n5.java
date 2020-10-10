package Hometask2;

public class Task1n5 {
    public static void main(String[] args) {
        char b = (char) 215;
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.format(j + " " + b + " " + i + " = " + (i * j)+  "  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " " + b + " " + i + " = " + (i * j)+  "  ");
            }
            System.out.println("");
        }
    }
}
