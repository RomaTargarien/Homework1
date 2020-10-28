package Hometask4.Stroki;

public class Time2 {
    public String makeReadable(int mili, boolean time) {
        long millisecond = mili%1000;
        long hours = (mili - millisecond)/1000/3600;
        long minutes = ((mili - millisecond)/1000 - 3600*hours)/60;
        long seconds = ((mili - millisecond)/1000 - 3600*hours) - 60*minutes;
        if (time){
            return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, millisecond);
        }
        return String.format("%d" + endOfHours(hours) + " %d минут" +endOfOthers(minutes) + " %d секунд" +
        endOfOthers(seconds) + " %d милисекунд"  + endOfOthers(millisecond),hours, minutes, seconds, millisecond);
    }
    private static String endOfHours(long hours){
        if (hours%10 == 1 && hours !=11){
            return " час";
        }
        if ((hours%10 == 2 || hours%10 == 3 || hours%10 == 4) && hours != 12 && hours != 13 && hours != 14){
            return " часа";
        }
        return " часов";
    }
    private static String endOfOthers(long any){
        if (any%10 == 1 && any !=11){
            return "а";
        }
        if ((any%10 == 2 || any%10 == 3 || any%10 == 4) && any != 12 && any != 13 && any != 14){
            return "ы";
        }
        return "";
    }
}
