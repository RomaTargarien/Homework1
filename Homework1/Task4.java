package Homework1;

public class Task4 {
    public static void main(String[] args) {
        boolean iCanSleep = sleepIn(true, false);
        if (iCanSleep){
            System.out.println("Можно спать");
        }
        else{
            System.out.println("Пора на работу");
        }
    }
    public static boolean sleepIn (boolean weekday, boolean vacation){
        return !weekday || vacation;
    }
}
