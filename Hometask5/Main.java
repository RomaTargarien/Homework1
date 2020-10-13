package Hometask5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
//C:\Users\ирина\Downloads\Telegram Desktop\тесты\тесты\WarAndPiece.txt

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите цифру, которая" +
                " соответсвует какую операцию хотите провести с вашим текстом: \n 1) Вывод " +
                "уникальных слов (Set) \n 2) Топ самых частых слов (Map)\n 3) Как " +
                "часто встречается введенное вами слово (Search) \n 4)" +
                " Как часто встречается введенное вами слово (RegExSearch)");
        int num = Integer.parseInt(reader1.readLine());
        switch (num){
            case 1:
                Setka setka = new Setka();
                System.out.println(setka.go(returnArray()));
                break;
            case 2:
                System.out.println("Укажите сколько слов выводить: ");
                Mapka mapka = new Mapka();
                System.out.println(mapka.go(returnArray(),Integer.parseInt(reader1.readLine())));
                break;
            case 3:
                System.out.println("Введите слово которое хотите найти: ");
                ISearchEngine searcher = new EasySearch();
                System.out.println(searcher.search(returnText2().toLowerCase(), reader1.readLine().toLowerCase()));
                break;
            case 4:
                System.out.println("Введите слово которое хотите найти: ");
                ISearchEngine searcher2 = new RegExSearch();
                System.out.println(searcher2.search(returnText2().toLowerCase(),reader1.readLine().toLowerCase()));
                break;
        }
        ISearchEngine iSearchEngine = new RegExSearch();
        System.out.println("Слово \"война\" встрчеается " + iSearchEngine.search(returnText2().toLowerCase(),"война")+ " раза");
        System.out.println("Слово \"и\" встрчеается " + iSearchEngine.search(returnText2().toLowerCase(),"и")+ " раз");
        System.out.println("Слово \"мир\" встрчеается " + iSearchEngine.search(returnText2().toLowerCase(),"мир") + " раз");
    }
    public static String returnText() throws IOException {
        String result = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Вставьте текст, с которым необходимо провести операции: ");
                String content = reader.readLine();
                result = new String (Files.readAllBytes( Paths.get(content) ) );
                flag = false;
            }
            catch (java.nio.file.NoSuchFileException e){
                System.out.println("Ошибка в чтении файла");
            }
        }
        return result;
    }
    public static String returnText2() throws IOException {
        String result = "";
        String path = ".." + File.separator + "WarAndPiece.txt";
        File file = new File(path);
        boolean exist = file.exists();
        if (exist){
            result = new String(Files.readAllBytes(Paths.get(path)));
        } else {
            System.out.println("Не вижу файла");
        }
        return result;
    }

    public static String[] returnArray() throws IOException {
        return (returnText2()).replaceAll("[,.!?\"()1234567" +
                "890=+\\-qwertyuiopasdfghjklzxcvbnm'>^]", "").split("\\p{P}?[ \\t\\n\\r]+");
    }
}
//метод search должен возвращать result
//должны быть экземпляры каждого класса
//метод везде должен принимать одно и то же