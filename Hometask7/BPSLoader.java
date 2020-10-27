package Hometask7;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BPSLoader extends SiteLoader {
    @Override
    public double load(Currency currencyName) {
        return load("https://www.bps-sberbank.by/rates/rates.json", currencyName);
    }

    @Override
    public Map<String, Double> loadDate(Currency currencyName, String[] args) {
        return null;
    }

    @Override
    protected double handle(String content, Currency currencyName) {
        StringBuilder valueStr = new StringBuilder();
        String[] array = content.split("RATE\",\"iso\":\"");
        array[0] = null;
        for (int i = 1; i < array.length; i++){
            Pattern pattern = Pattern.compile(String.valueOf(currencyName));
            Matcher matcher = pattern.matcher(array[i]);
            char[] allchars = array[i].toCharArray();
            if (matcher.find() && !(allchars[array[i].indexOf("CURRENCY")+28] == 'n')){
                int j = 0;
                do {
                    valueStr.append((allchars[array[i].indexOf("buy") + 5 + j]));
                    j++;
                } while ((allchars[array[i].indexOf("buy") + 5 + j] != ','));
            }
        }
        return Double.parseDouble(valueStr.toString());
    }
}
