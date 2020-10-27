package Hometask7;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
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
        double value = 0;
        StringBuilder valueStr = new StringBuilder();
        Pattern pattern = Pattern.compile(String.valueOf(currencyName));
        Matcher matcher = pattern.matcher(content);
        char[] allchars = content.toCharArray();
        if (matcher.find()) {
            for (int i = 0; i < 6; i++){
                valueStr.append(allchars[content.indexOf("Cur_OfficialRate") + 18 + i]);
                if (i == 5){
                    value = Double.parseDouble(valueStr.toString());
                }
            }

        }
        return value;

    }
}
