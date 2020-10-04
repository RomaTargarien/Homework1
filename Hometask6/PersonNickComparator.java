package Hometask6;

import java.util.Comparator;

public class PersonNickComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
//Comparator для Ника
