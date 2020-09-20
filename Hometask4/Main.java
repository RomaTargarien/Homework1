package Hometask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от -999 999 999 до 999 999 999: " );
        System.out.println(new Stroki1().toString(reader.readLine()));

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите колличество прошедших дней: ");
        int day = Integer.parseInt(reader2.readLine());
        System.out.println(new Weeks().toWeek(day));

    }
}
