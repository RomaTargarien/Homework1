package Hometask4.Stroki;

public class Time {

    @Deprecated
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        String result = "";
        long mili = millisecond%1000;
        long hours = (millisecond - mili)/1000/3600;
        long minutes = ((millisecond - mili)/1000 - 3600*hours)/60;
        long seconds = ((millisecond - mili)/1000 - 3600*hours) - 60*minutes;
        if (shortFormat) {
            if (hours < 10) {
                result += ("0" + hours + ":");
            }
            if (hours >= 10) {
                result += hours + ":";
            }

            if (minutes < 10) {
                result += ("0" + minutes + ":");
            }
            if (minutes >= 10) {
                result += minutes + ":";
            }

            if (seconds < 10) {
                result += ("0" + seconds + "");
            }
            if (seconds >= 10) {
                result += seconds + "";
            }

            if (mili < 10) {
                result += (".00" + mili);
            }
            if (mili >= 10 && mili <= 99) {
                result += (".0" + mili);
            }
            if (mili >= 100) {
                result += "." + mili;
            }
            return result;
        }
        if (!shortFormat){
            result = hours + endOfHours(hours) + " " + minutes + endOfMinutes(minutes) + " " +
            seconds + endOfSecunds(seconds) + " " + mili+ endOfMiliSeconds(mili);
        }
        return result;

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

    private static String endOfMinutes(long mimutes){
        if (mimutes%10 == 1 && mimutes !=11){
            return " минута";
        }
        if ((mimutes%10 == 2 || mimutes%10 == 3 || mimutes%10 == 4) && mimutes != 12 && mimutes != 13 && mimutes != 14){
            return " минуты";
        }
        return " минут";
    }

    private static String endOfSecunds(long secunds){
        if (secunds%10 == 1 && secunds !=11){
            return " секунда";
        }
        if ((secunds%10 == 2 || secunds%10 == 3 || secunds%10 == 4) && secunds != 12 && secunds != 13 && secunds != 14){
            return " секунды";
        }
        return " секунд";
    }

    private static String endOfMiliSeconds(long milicesonds){
        if (milicesonds%10 == 1 && milicesonds !=11){
            return " милисекунда";
        }
        if ((milicesonds%10 == 2 || milicesonds%10 == 3 || milicesonds%10 == 4) && milicesonds != 12 && milicesonds != 13 && milicesonds != 14){
            return " милисекунды";
        }
        return " милисекунд";
    }
}
