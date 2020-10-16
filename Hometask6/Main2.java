package Hometask6;

import Hometask6.ComparatorsPerson.PersonComparator;
import Hometask6.ComparatorsPerson.PersonNickComparator;
import Hometask6.ComparatorsPerson.PersonPasswordComparator;

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

        long start2 = System.currentTimeMillis();
        List<Person> personList = new LinkedList<>();
        for (int i = 0; i < a; i++){
            personList.add(new Factory().createPerson());
        }
        long finish2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        Set<Person> personSet = new HashSet<>();
        for (int i = 0; i < a; i++){
            personSet.add(new Factory().createPerson());
        }
        long finish3 = System.currentTimeMillis();

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

        long start6 = System.currentTimeMillis();
        personList.sort(new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
        long finish6 = System.currentTimeMillis();
        System.out.println("Для сортировки Linkedlist встроенными средствами jdk понадобилось: " + (finish6 - start6));

        //сортировка собственным методом сортировки

        PersonComparator personComparator = new PersonComparator();
        personComparator.sortAll(personArray);
        personComparator.sortAll(personList);

        //вывод коллекций в консоль при помощи итератора
        long start7 = System.currentTimeMillis();
        Iterator<Person> iteratorArray = personArray.iterator();
        while (iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());
        }
        long finish7 = System.currentTimeMillis();

        long start8 = System.currentTimeMillis();
        Iterator<Person> iteratorList = personList.iterator();
        while (iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }
        long finish8 = System.currentTimeMillis();

        long start9 = System.currentTimeMillis();
        Iterator<Person> iteratorSet = personSet.iterator();
        while (iteratorSet.hasNext()){
            System.out.println("-"+iteratorSet.next());
        }
        long finish9 = System.currentTimeMillis();

        long start10 = System.currentTimeMillis();
        Iterator<Person> iteratorTree = personTree.iterator();
        while (iteratorTree.hasNext()){
            System.out.println(iteratorTree.next());
        }
        long finish10 = System.currentTimeMillis();
        //Удаление элементов при помощи итератора

        long start11 = System.currentTimeMillis();
        Iterator<Person> iteratorArray1 = personArray.iterator();
        while (iteratorArray1.hasNext()){
           iteratorArray1.next();
           iteratorArray1.remove();
        }
        long finish11 = System.currentTimeMillis();

        long start12 = System.currentTimeMillis();
        Iterator<Person> iteratorList1 = personList.iterator();
        while (iteratorList1.hasNext()){
            iteratorList1.next();
            iteratorList1.remove();
        }
        long finish12 = System.currentTimeMillis();

        long start13 = System.currentTimeMillis();
        Iterator<Person> iteratorSet1 = personSet.iterator();
        while (iteratorSet1.hasNext()){
            iteratorSet1.next();
            iteratorSet1.remove();
        }
        long finish13 = System.currentTimeMillis();

        long start14 = System.currentTimeMillis();
        Iterator<Person> iteratorTree1 = personTree.iterator();
        while (iteratorTree1.hasNext()){
            iteratorTree1.next();
            iteratorTree1.remove();
        }
        long finish14 = System.currentTimeMillis();
        System.out.println("Для заполнения ArrayList понадобилось: " + (finish - start) + "" +
                " сортировка: " + (finish5 - start5) + " итерирование: " + (finish7-start7) +
                " удаление(итератор): " + (finish11 - start11));
        System.out.println("Для заполнения LinkedList понадобилось: " + (finish2 - start2) +
                " сортировка: " + (finish6 - start6) + " итерирование: " + (finish8-start8) +
                " удаление(итератор): " + (finish12 - start12));
        System.out.println("Для заполнения Hashset понадобилось: " + (finish3 - start3) +
                " сортировка: -" + " итерирование: " + (finish9-start9) +
                " удаление(итератор): " + (finish13 - start13));
        System.out.println("Для заполнения Treeset понадобилось: " + (finish4 - start4) +
                " сортировка: 0(TreeSet заполняется отсортированной)" + " итерирование: " + (finish10-start10) +
                " удаление(итератор): " + (finish14 - start14));


    }
}
