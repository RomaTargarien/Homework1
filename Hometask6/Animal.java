package Hometask6;

public class Animal {
    private String nick;
    private int age;

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 15){
            this.age = age;
        }
        else {
            System.out.println("Ошибка! Возраст животного должен быть от 1 до 15 лет.");
        }
    }

    public Animal(String nick, int age) {
        this.nick = nick;
        if (age >= 1 && age <= 15){
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст у животного "+ nick +" должен быть от 1 до 15 лет.");
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}
//Класс Animal
