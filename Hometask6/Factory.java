package Hometask6;

import java.util.Collection;
import java.util.Random;
import java.util.function.Supplier;

public class Factory {
    private static final char[] stroka = ("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPAS" +
            "DFGHJKLZXCVBNMёйцукенгшщзхъфывапролджэячсмитьбюЁЙЦУКЕНГШЩЗХ" +
            "ЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ").toCharArray();

    private static final Random random = new Random();

    public static Person createPerson(){
        return new Person(returnNick(),returnPassword());
    }

    public static Animal createAnimal() {return new Animal(returnNick(), random.nextInt(20));}

    private static String returnNick(){
        int lenght = new Random().nextInt(9) + 1;
        StringBuilder result = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++){
            result.append(stroka[random.nextInt(stroka.length)]);
        }
        return result.toString();
    }
    private static String returnPassword(){
        int lenght = new Random().nextInt(6) + 5;
        StringBuilder result = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++){
            result.append(stroka[random.nextInt(stroka.length)]);
        }
        return result.toString();
    }

    public static <T> void generator(Collection<T> collection, Supplier<T> supplier, int count){
        for (int i = 0; i < count; i++){
            collection.add(supplier.get());
        }
    }
}
//Фабрика для создания объектов Person. Реализовано в Main2.
