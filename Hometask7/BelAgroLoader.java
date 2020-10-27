package Hometask7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelAgroLoader extends SiteLoader {
    @Override
    public double load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?ondate=11/22/2016", currencyName);
    }

    @Override
    public Map<String, Double> loadDate(Currency currencyName, String[] args) {
        //возвращение мапы с одной датой
        Map<String, Double> date_value = new TreeMap<>();
        if (args[0].length() == 10){
            double value = load("https://belapb.by/ExCardsDaily.php?ondate=" +
                    args[0].replaceAll("\\.","/"), currencyName);
            date_value.put(args[0],value);
            return date_value;
        }

        //возвращение мапы со многими датами
        String[] twoDates = args[0].split("[-,]");
        String firstDate = twoDates[0].replaceAll("\\.","/");
        String secondDate = twoDates[1].replaceAll("\\.","/");
        Calendar calendar = new GregorianCalendar();
        calendar.set(returnYears(firstDate), returnMonths(firstDate)-1,returnDays(firstDate));
        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(returnYears(secondDate), returnMonths(secondDate)-1,returnDays(secondDate)+1);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        while (calendar.compareTo(calendar2) != 0){
            String date1 = df.format(calendar.getTime());
            Double value = load("https://belapb.by/ExCardsDaily.php?ondate=" + date1, currencyName);
            String[] dateForSort = date1.split("/");
            String newDate = dateForSort[2] + "/" + dateForSort[0] + "/" + dateForSort[1];
            date_value.put(newDate, value);
            calendar.add(Calendar.HOUR_OF_DAY,24);
        }
        return date_value;
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        StringBuilder valueStr = new StringBuilder();
        content = content.replaceAll(" +", "");
        content = content.replaceAll("\n", "");
        String[] array = content.split("<CharCode>");
        for (String s : array){
            Pattern pattern = Pattern.compile(String.valueOf(currencyName));
            Matcher matcher = pattern.matcher(s);
            char[] allchars = s.toCharArray();
            if (matcher.find() && allchars[3] == '<'){
                for (int i = 0; i < 5; i++){
                    valueStr.append((allchars[s.indexOf("<RateBuy>") + 9 + i]));
                }
            }
        }
        if (valueStr.toString().equals("")){
            return 0;
        }
        return Double.parseDouble(valueStr.toString());
    }

    //методы возвращают значение дней, месяцев, лет

    public static int returnMonths(String month){
        String[] dates = month.split("/");
        return Integer.parseInt(dates[0]);
    }
    public static int returnDays(String day){
        String[] dates = day.split("/");
        return Integer.parseInt(dates[1]);
    }
    public static int returnYears(String year){
        String[] dates = year.split("/");
        return Integer.parseInt(dates[2]);
    }
}
