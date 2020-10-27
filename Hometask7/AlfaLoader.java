package Hometask7;


import java.util.Currency;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlfaLoader extends SiteLoader {

    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    @Override
    public Map<String, Double> loadDate(Currency currencyName, String[] args) {
        return null;
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
        String[] array = content.split("sellIso");
        for (String s : array){
            Pattern pattern = Pattern.compile(String.valueOf(currencyName));
            Matcher matcher = pattern.matcher(s);
            Pattern pattern2 = Pattern.compile("BYN");
            Matcher matcher2 = pattern2.matcher(s);
            char[] allchars = s.toCharArray();
            if (matcher.find() && matcher2.find()){
                for (int i = 0; i < 6; i++){
                    valueStr.append((allchars[s.indexOf("buyRate") + 9 + i]));
                }
            }
        }
        return Double.parseDouble(valueStr.toString());
    }
}
