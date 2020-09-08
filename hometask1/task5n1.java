package Hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class task5n1 {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = (reader.readLine()).toLowerCase();
        boolean boyName = Objects.equals(name,"вася");
        boolean girlName = Objects.equals(name,"анастасия");
        if (boyName){
            System.out.println("Привет \nЯ тебя так долго ждал");
            return;
        }
        else if (girlName){
            System.out.println("Я тебя так долго ждал");
            return;
        } else  {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
