package Hometask2;

public class Task1n2 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        int result = 1;
        for (int i = 0; i < args.length; i++){
            if (Integer.parseInt(args[i]) != 0) {
                result = result * Integer.parseInt(args[i]);
            }
            else {
                System.out.println("Под позицией номер " + (i + 1) + " был ноль.");
                result = 0;
                break;
            }
        }
        System.out.println("Ваш ответ: " + result);
    }
}
