package Hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6n2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите семизначный номер телефона: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String telephone = reader.readLine();
            double number = Integer.parseInt(telephone)/Math.pow(10,7);
            if (number < 1 && number > 0.1) {
                System.out.println(createnumber(telephone));
                break;
            } else {
                System.out.print("Введите корректный номер телефона: ");
            }
        }
    }
    public static String createnumber(String telephone2) throws IOException {
        String code = "+375";
        System.out.print("Скажите какой у вас оператор: A1 или МТС: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String operator = reader.readLine();
            if (operator.toLowerCase().equals("а1")) {
                code += "(44)";
                break;
            } else if (operator.toLowerCase().equals("мтс")) {
                code += "(17)";
                break;
            } else {
                System.out.print("Введите оператор");
            }
        }
        int number = Integer.parseInt(telephone2);
        int numberFirst3 = number/10000;
        code += String.valueOf(numberFirst3);
        int numberLast4 = number - numberFirst3*10000;
        code += "-" + numberLast4;
        return code;
    }
}
