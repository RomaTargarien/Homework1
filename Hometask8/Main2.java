package Hometask8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        //я тут проверяю что быстрее работает
        long start = System.currentTimeMillis();
        List<Student> students = Stream.generate(Generator::makeStudent)
                .limit(1000000)
                .collect(Collectors.toList());
        long finish = System.currentTimeMillis();

        long start1 = System.currentTimeMillis();
        Collection<Student> array = new ArrayList<>();
        Generator.generate(array, Generator::makeStudent , 1000000);
        long finish1 = System.currentTimeMillis();

        System.out.println((finish - start) + " " + (finish1 - start1));
        StringBuilder res = new StringBuilder();

        //это простой вывод файла

        try (FileReader reader = new FileReader(".." + File.separator + "bestStudents.txt")){
            int c;
            while ((c = reader.read()) != -1) {
                char a = (char) c;
                res.append(a);
            }
          //  System.out.println(res);
        } catch (IOException e){
            System.out.println("Что-то пошло не так");
        }

        //это вывод с присвоением
        List<Student> bestStudents = new ArrayList<>();
        String[] array2 = res.toString().split("\n");
        for (String s : array2){
            String[] information = s.split(" ");
            Student student = new Student(information[1],information[0],
                    information[2], Integer.parseInt(information[3]));
            bestStudents.add(student);
        }
        for (Student student : bestStudents){
            System.out.println(student.getFIO() + " " + student.getMark());
        }



    }
}
