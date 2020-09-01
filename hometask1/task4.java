package hometask1;

public class task4 {
    public static void main(String[] args) {
        boolean ICanSleep = sleepIn(false, true);
        if (ICanSleep){
            System.out.println("Можно спать");
        }
        else{
            System.out.println("Пора на работу");
        }
    }
    public static boolean sleepIn (boolean weekday, boolean vacation){
        return !weekday;
    }
    //можно использовать и второй параметр - vacation, но эти два параметра являются взаимо исключающимися. Если weekday - true, значит vacation - false и наоборот. Поэтому использование второго параметра необязательно
}
