package Honetask5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        String result = "";
        while (flag) {
            try {
                System.out.println("Вставьте текст, с которым необходимо провести операции: ");
                String content = reader.readLine();
                result = new String ( Files.readAllBytes( Paths.get(content) ) ).toLowerCase();
                flag = false;
            }
            catch (java.nio.file.NoSuchFileException e){
                System.out.println("Ошибка в чтении файла");
            }
        }
        String[] AllWords = (result).replaceAll("[,.!?\"()1234567" +
                "890=+\\-qwertyuiopasdfghjklzxcvbnm'>^]", "").split("\\p{P}?[ \\t\\n\\r]+");

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите цифру, которая" +
                " соответсвует какую операцию хотите провести с вашим текстом: \n 1) Вывод " +
                "уникальных слов (Set) \n 2) Топ самых частых слов (Map)\n 3) Как" +
                "часто встречается введенное вами слово (Search) ");
        int num = Integer.parseInt(reader1.readLine());
        switch (num){
            case 1:
                System.out.println(new Setka().go(AllWords));
                break;
            case 2:
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Укажите сколько слов выводить: ");
                int num1 = Integer.parseInt(reader2.readLine());
                System.out.println(new Mapka().go(AllWords, num1));
                break;
            case 3:
                BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите слово которое хотите найти: ");
                String word = reader3.readLine();
                System.out.println(new EasySearch().search(result, word));
                break;

        }
    }
}
