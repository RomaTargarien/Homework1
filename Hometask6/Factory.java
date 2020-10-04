package Hometask6;

import java.util.Random;

public class Factory {
    private static final char[] stroka = ("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPAS" +
            "DFGHJKLZXCVBNMёйцукенгшщзхъфывапролджэячсмитьбюЁЙЦУКЕНГШЩЗХ" +
            "ЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ").toCharArray();

    private static final Random random = new Random();

    public Person createPerson(){
        return new Person(returnNick(),returnPassword());
    }
    private String returnNick(){
        int lenght = new Random().nextInt(9) + 1;
        StringBuilder result = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++){
            result.append(stroka[random.nextInt(stroka.length)]);
        }
        return result.toString();
    }
    private String returnPassword(){
        int lenght = new Random().nextInt(6) + 5;
        StringBuilder result = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++){
            result.append(stroka[random.nextInt(stroka.length)]);
        }
        return result.toString();
    }
}
//Фабрика для создания объектов Person. Реализовано в Main2.
