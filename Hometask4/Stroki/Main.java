package Hometask4.Stroki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от -999 999 999 до 999 999 999: " );
        System.out.println(new Number().toString(reader.readLine()));

        System.out.print("Введите колличество прошедших дней: ");
        System.out.println(new Weeks().toWeek(Integer.parseInt(reader.readLine())));

        System.out.println(new Time().toHoursMinuteSecondMillisecond(7789001,true));
        System.out.println(new Time().toHoursMinuteSecondMillisecond(3131233,false));

    }
}
