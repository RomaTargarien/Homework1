package Additional;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hanoi {

    private static List<List<String>> field = new ArrayList<>(10);
    private static int count = 0;
    private static int size = 0;

    public static void main(String[] args) throws IOException {
        play();
    }
    public static void play(){
        explainRules();
        FirstHod();
        drawfield();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int hod = scanner.nextInt();
            replace(hod / 10, hod % 10);
            drawfield();
            if (check()){
                return;
            }
        }
    }

    public static void save(List<List<String>> field){
        System.out.println("Укажите куда вы хотите сохранить");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter writer = new FileWriter(reader.readLine());
            for (int i = 0; i < 3; i++){
                writer.write(field.get(i).toString());
            }
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    } //не готово

    public static void explainRules(){
        System.out.println("Даны три стержня, на один из которых нанизаны кольца, причём" +
                " кольца отличаются размером и лежат меньшее на большем. Задача состоит в " +
                "том, чтобы перенести пирамиду из колец за наименьшее число ходов на другой" +
                " стержень. За один раз разрешается переносить только одно кольцо, причём нельзя" +
                " класть большее кольцо на меньшее. В нашем случае игра происходит на числах а не на " +
                "кольцах. Все остальныое измнений не претерпевает. С какого ряда на какой переходить" +
                "надо указывать в формате 12, 23 и тд. Желаю удачной игры!");
    }

    public static void FirstHod(){
        System.out.println("Введите размер поля от 3 до 8 на котором желаете сыграть:");
        Scanner sizeSc = new Scanner(System.in);
        while (true) {
            size = sizeSc.nextInt();
            if (size > 2 && size < 9) {
                System.out.println("Произошло заполнение поля: ");
                int k = 0;
                for (int i = 0; i < size; i++) {
                    List<String> horizont = new ArrayList<>(3);
                    for (int j = 0; j < 3; j++) {
                        if (k == i) {
                            k++;
                            horizont.add(String.valueOf(k));
                        }
                        horizont.add("*");
                    }
                    field.add(horizont);
                }
                break;
            }
            System.out.println("Повторите ввод");
        }
    }

    public static void drawfield() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void replace(int otkuda, int kuda) {
        if (otkuda >= 0 && otkuda <= 3 && kuda >= 0 && kuda <= 3 && kuda != otkuda) {
            List<String> copyOtkuda = new ArrayList<>();
            List<String> copyKuda = new ArrayList<>();
            String a = "";
            int index = 4;
            for (int i = 0; i < size; i++) {
                copyOtkuda.add(field.get(i).get(otkuda - 1));
            }
            for (int i = 0; i < size; i++) {
                copyKuda.add(field.get(i).get(kuda - 1));
            }
            for (int i = 0; i < copyOtkuda.size(); i++) {
                if (!copyOtkuda.get(i).equals("*")) {
                    index = i;
                    a = copyOtkuda.get(i);
                    field.get(i).set(otkuda - 1, "*");
                    break;
                } if (copyOtkuda.get(copyOtkuda.size()-1).equals("*")){
                    System.out.println("Ход сделан неверно. Ряд пустой. Попробуйте походить еще раз.");
                    return;
                }
            }

            for (int i = copyKuda.size() - 1; i >= 0; i--) {
                    if (copyKuda.get(copyKuda.size()-1).equals("*")) {
                        field.get(i).set(kuda - 1, a);
                        count++;
                        break;
                    }
                    if (copyKuda.get(i).equals("*") && Integer.parseInt(copyKuda.get(i+1)) > Integer.parseInt(a)) {
                        field.get(i).set(kuda - 1, a);
                        count++;
                        break;
                    }
                    if (copyKuda.get(i).equals("*") && Integer.parseInt(copyKuda.get(i+1)) < Integer.parseInt(a)) {
                        field.get(index).set(otkuda-1,a);
                        System.out.println("Ход сделан неверно. Нельзя ставить большие числа на меньшие. Попробуйте походить еще раз.");
                        break;
                }

            }
        } else {
            System.out.println("Ход сделан неверно. Попробуйте походить еще раз.");
        }
    }

    public static boolean check(){
        if (!field.get(0).get(2).equals("*")) {
            System.out.println("Вы выиграли! Вам потребовалось " + count + " ходов.");
            return true;
        }
        return false;
    }
}