package Hometask6.ComparatorsPerson;

import Hometask6.Person;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}
//Comparator для Пароля
