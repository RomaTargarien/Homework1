package Hometask4;

public class Weeks {
    public String toWeek(int day){
        int i = 1;
        int week = 0;
        while (i <= day){
            if (i % 7 == 0){
                week++;
            }
            i++;
        }
        if (week % 100 == 11 ||week % 100 == 12||week % 100 == 13||week % 100 == 14 ){
            return week + " недель";
        }
        if ( (week - 1) % 10 == 0){
            return week + " неделя";
        }
        if (week % 10 == 2 || week % 10 == 3 || week % 10 == 4){
            return week + " недели";
        }
        return week + " недель";
    }
}
