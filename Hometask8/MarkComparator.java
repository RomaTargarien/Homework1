package Hometask8;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getMark() - o1.getMark();
    }
}
