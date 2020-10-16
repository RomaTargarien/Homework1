package Hometask6.ComparatorsPerson;

import Hometask6.Person;

import java.util.List;

public class PersonComparator {
    public void sortPassword(List<Person> personList){
        for (int i = personList.size() - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (new PersonPasswordComparator().compare(personList.get(j), personList.get(j+1)) > 0){
                    change(personList, j);
                }
            }
        }
    }
    public void sortAll(List<Person> personList){
        for (int i = personList.size() - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (new PersonPasswordComparator().compare(personList.get(j), personList.get(j+1)) == 0) {
                    if (new PersonNickComparator().compare(personList.get(j), personList.get(j+1)) > 0){
                        change(personList, j);
                    }
                }
                if (new PersonPasswordComparator().compare(personList.get(j), personList.get(j+1)) > 0){
                    change(personList, j);
                }
            }
        }
    }
    private void change(List<Person> personList, int j){
        Person copy = personList.get(j);
        personList.set(j, personList.get(j + 1));
        personList.set(j + 1, copy);
    }
}
//собственный метод сортировки. Реализован в Main.