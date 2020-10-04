package Hometask6;

import java.util.Comparator;
import java.util.List;

public class AnimalComparator implements Comparator<String> {
    public int compare2(int o1, int o2) {
        return o1 - o2;
    }
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    public void sortAge(List<Animal> animalList){
        for (int i = animalList.size() - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (compare2(animalList.get(j).getAge(),animalList.get(j+1).getAge()) > 0){
                    Animal copy = animalList.get(j);
                    animalList.set(j, animalList.get(j + 1));
                    animalList.set(j + 1, copy);
                }
            }
        }
    }
    public void sortAll(List<Animal> animalList){
        for (int i = animalList.size() - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (compare2(animalList.get(j).getAge(),animalList.get(j+1).getAge()) == 0) {
                    if (compare(animalList.get(j).getNick(),animalList.get(j+1).getNick()) > 0){
                        Animal copy = animalList.get(j);
                        animalList.set(j, animalList.get(j + 1));
                        animalList.set(j + 1, copy);
                    }
                }
                if (compare2(animalList.get(j).getAge(),animalList.get(j+1).getAge()) > 0){
                    Animal copy = animalList.get(j);
                    animalList.set(j, animalList.get(j + 1));
                    animalList.set(j + 1, copy);
                }
            }
        }
    }
}
//собственный метод сортировки Animal. Реализован в Main.
