package Hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5n2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        switch (name.toLowerCase()){
            case "вася": {
                System.out.println("Привет \nЯ тебя так долго ждал");
                break;
            }
            case "анастасия": {
                System.out.println("Я тебя так долго ждал");
                break;
            }
            default: {
                System.out.println("Добрый день, а вы кто?");
                break;
            }

        }
    }
}
