package hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5n1 {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.toLowerCase().equals("вася")){
            System.out.println("Привет \nЯ тебя так долго ждал");
        }
        else if (name.toLowerCase().equals("анастасия")){
            System.out.println("Я тебя так долго ждал");
        } else  {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
