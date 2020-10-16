package Hometask6.ComparatorsAnimal;

import Hometask6.Animal;

import java.util.List;

public class AnimalComparator {
    public void sortAge(List<Animal> animalList){
        for (int i = animalList.size() - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (new AnimalAgeComparator().compare(animalList.get(j),animalList.get(j+1)) > 0){
                    change(animalList, j);
                }
            }
        }
    }
    public void sortAll(List<Animal> animalList){
        for (int i = animalList.size() - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (new AnimalAgeComparator().compare(animalList.get(j),animalList.get(j+1)) == 0) {
                    if (new AnimalNickComparator().compare(animalList.get(j), animalList.get(j+1)) > 0){
                        change(animalList, j);
                    }
                }
                if (new AnimalAgeComparator().compare(animalList.get(j),animalList.get(j+1)) > 0){
                    change(animalList, j);
                }
            }
        }
    }
    private void change(List<Animal> animalList, int j){
        Animal copy = animalList.get(j);
        animalList.set(j, animalList.get(j + 1));
        animalList.set(j + 1, copy);
    }
}
//собственный метод сортировки Animal. Реализован в Main.
