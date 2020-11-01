package Hometask8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите откуда считать данные о студентах или нажмите клавишу enter( если данные " +
                "сохранены в документе рядом с программой)");
        String path = bufferedReader.readLine();
        List<Student> students;

        if (path.equals("")){
            path = ".." + File.separator + "students.bin";
            File file = new File(path);
            boolean exists = file.exists();
            if (exists){
                students = open(path);
            } else {
                System.out.println("К сожалению по указанному пути файла нет. Будет сгенерирована новая коллекуция" +
                        " и сохранена в файл с этим именем через сериализацию и через запись ФИО и оценки");
                students = Stream.generate(Generator::makeStudent)
                        .limit(10000)
                        .collect(Collectors.toList());
                save(students);
            }
        } else {
            students = open(path);
        }

        System.out.println("Сколько самых преуспевающих студентов вам показать?");
        int count = Integer.parseInt(bufferedReader.readLine());
        students = show(count, students);
        saveBest(students);
        System.out.println("Завершено");

    }

    public static ArrayList<Student> open(String path){
        ArrayList<Student> students1 = new ArrayList<>();
        try(FileInputStream fil = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fil)) {
            students1 = (ArrayList<Student>) ois.readObject();
        } catch (IOException  e){
            System.out.println("Что то пошло не так");
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println("Еще что то не так");
        }
        return students1;
    }

    public static void save(List<Student> students){
        try (FileOutputStream fos = new FileOutputStream(".." + File.separator + "students.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)){
            objectOutputStream.writeObject(students);
        } catch (FileNotFoundException e){
            System.out.println("Что то не так с файлом" + e.getMessage());
        } catch (IOException e){
            System.out.println("Что то совсем не так" + e.getMessage());
        }
        savetxt(".." + File.separator + "students.txt", students);
    }

    public static void saveBest(List<Student> students) throws IOException {
        System.out.println("Укажите куда будем сохранять лучших студентов либо файл сохранится рядом с пргораммой " +
                "с названием bestStudents.txt (нажатие клавиши enter)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        if (path.equals("")){
            savetxt(".." + File.separator + "bestStudents.txt", students);
        }
        else {
            savetxt(path, students);
        }
    }

    public static List<Student> show(int count, List<Student> students){
        students = students.stream()
                .sorted(new MarkComparator())
                .limit(count)
                .sorted(new NameComparator())
                .collect(Collectors.toList());
        for (Student student : students){
            System.out.println(student.getFIO() + " " + student.getMark());
        }
        return students;
    }

    public static void savetxt(String path, List<Student> students){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (Student student : students) {
                bufferedWriter.write(student.getFIO() + " " + student.getMark() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
