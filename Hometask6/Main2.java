package Hometask6;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        //заполнение коллекций и рассчет соответсвующего времени для каждой

        System.out.println("Введите количество Person для заполнения: ");
        int a = new Scanner(System.in).nextInt();

        List<Person> personArray = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < a; i++){
            personArray.add(new Factory().createPerson());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Для заполнения ArrayList понадобилось: " + (finish - start));

        long start2 = System.currentTimeMillis();
        List<Person> personList = new LinkedList<>();
        for (int i = 0; i < a; i++){
            personList.add(new Factory().createPerson());
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("Для заполнения LinkedList понадобилось: " + (finish2 - start2));

        long start3 = System.currentTimeMillis();
        Set<Person> personSet = new HashSet<>();
        for (int i = 0; i < a; i++){
            personSet.add(new Factory().createPerson());
        }
        long finish3 = System.currentTimeMillis();
        System.out.println("Для заполнения Hashset понадобилось: " + (finish3 - start3));

        //Далее сортировки встроенными средствами jdk

        Comparator<Person> comparator = new PersonPasswordComparator().thenComparing(new PersonNickComparator());
        long start4 = System.currentTimeMillis();
        Set<Person> personTree = new TreeSet<>(comparator);
        for (int i = 0; i < a; i++){
            personTree.add(new Factory().createPerson());
        }
        long finish4 = System.currentTimeMillis();
        System.out.println("Для заполнения с одновременной сортировкой Treeset понадобилось: " + (finish4 - start4));

        long start5 = System.currentTimeMillis();
        personArray.sort(new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
        long finish5 = System.currentTimeMillis();
        System.out.println("Для сортировки Arraylist встроенными средствами jdk понадобилось: " + (finish5 - start5));

        long start6 = System.currentTimeMillis();
        personList.sort(new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
        long finish6 = System.currentTimeMillis();
        System.out.println("Для сортировки Linkedlist встроенными средствами jdk понадобилось: " + (finish6 - start6));

        //вывод коллекций в консоль при помощи итератора

        Iterator<Person> iteratorArray = personArray.iterator();
        while (iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());
        }
        Iterator<Person> iteratorList = personList.iterator();
        while (iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }
        Iterator<Person> iteratorSet = personSet.iterator();
        while (iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }
        Iterator<Person> iteratorTree = personTree.iterator();
        while (iteratorTree.hasNext()){
            System.out.println(iteratorTree.next());
        }
        //Удаление элементов при помощи итератора

        Iterator<Person> iteratorArray1 = personArray.iterator();
        while (iteratorArray1.hasNext()){
           iteratorArray1.next();
           iteratorArray1.remove();
        }
        Iterator<Person> iteratorList1 = personList.iterator();
        while (iteratorList1.hasNext()){
            iteratorList1.next();
            iteratorList1.remove();
        }
        Iterator<Person> iteratorSet1 = personSet.iterator();
        while (iteratorSet1.hasNext()){
            iteratorSet1.next();
            iteratorSet1.remove();
        }
        Iterator<Person> iteratorTree1 = personTree.iterator();
        while (iteratorTree1.hasNext()){
            iteratorTree1.next();
            iteratorTree1.remove();
        }





    }
}
