package Hometask8;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private String patronymic;
    private int mark;

    public Student(String name, String surname, String patronymic, int mark){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public String getFIO(){
        return surname + " " + name + " " + patronymic;
    }

    public int getMark() {
        return mark;
    }
}
