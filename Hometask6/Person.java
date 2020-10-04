package Hometask6;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Person  {
    private String nick;
    private String password;

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        if (password.length() >= 5 && password.length() <=10){
            this.password = password;
        } else {
            System.out.println("Ошибка! Пароль должен иметь от длину от 5 до 10 знаков");
        }
    }

    public Person(String nick, String password) {
        this.nick = nick;
        if (password.length() >= 5 && password.length() <=10){
            this.password = password;
        } else {
            System.out.println("Ошибка! Человек с ником " + nick + " должен иметь пароль длинной от 5 до 10 знаков");
        }

    }
    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
//Класс Person
