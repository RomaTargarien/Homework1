package Hometask6;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Рома", "53564");
        Person person1 = new Person("Енисей","7821413");
        Person person2 = new Person("Игнат", "asdfgh5р");
        Person person3 = new Person("Армен", "asdfgh5рр");
        Person person4 = new Person("Брут", "asdfg");
        Person person5 = new Person("Армен","jdcdc");

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);


        PersonComparator personComparatorPassword = new PersonComparator();
        personComparatorPassword.sortPassword(personList);

        for (Person persons : personList){
            System.out.println(persons.toString());
        }
        System.out.println();

        personComparatorPassword.sortAll(personList);

        System.out.println();

        for (Person persons : personList){
            System.out.println(persons.toString());
        }

        Animal animal = new Animal("Цезарь", 10);
        Animal animal2 = new Animal("Леон", 3);
        Animal animal3 = new Animal("Гай", 6);
        Animal animal4 = new Animal("Леон", 10);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);

        System.out.println();

        for (Animal animals : animalList){
            System.out.println(animals.toString());
        }
        AnimalComparator animalComparator = new AnimalComparator();

        animalComparator.sortAge(animalList);

        System.out.println();

        for (Animal animals : animalList){
            System.out.println(animals.toString());
        }

        animalComparator.sortAll(animalList);

        System.out.println();

        for (Animal animals : animalList){
            System.out.println(animals.toString());
        }




    }
}
