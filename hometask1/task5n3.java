package hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class task5n3 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = (reader.readLine()).toLowerCase();
        boolean boyName = Objects.equals(name,"вася");
        boolean girlName = Objects.equals(name,"анастасия");
        if (boyName || girlName){
            if (boyName){
                System.out.println("Привет \nЯ тебя так долго ждал");
            } if (girlName){
                System.out.println("Я тебя так долго ждал");
            }
        }
        if (!boyName && !girlName){
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
