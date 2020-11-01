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

        try (FileReader reader = new FileReader(".." + File.separator + "bestStudents.txt")){
            StringBuilder res = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                char a = (char) c;
                res.append(a);
            }
            System.out.println(res);
        } catch (IOException e){
            System.out.println("Что-то пошло не так");
        }
    }
}
