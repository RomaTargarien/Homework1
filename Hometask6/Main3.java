package Hometask6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Collection<Person> array = new ArrayList<>();
        Factory.generator(array, Factory ::createPerson, 100);
        for (Person person : array) {
            System.out.println(person);
        }
        Collection<Animal> animals = new HashSet<>();
        Factory.generator(animals, Factory:: createAnimal, 100);
        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
}
