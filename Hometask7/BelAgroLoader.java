package Hometask7;

public class BelAgroLoader extends SiteLoader{
    @Override
    public double load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?ondate=11/22/2013" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        double count = 1;
        try {
            count = Double.parseDouble(content);
        } catch (IllegalArgumentException e){
            System.out.println("Неверный тип данных");
        }
        return count;
    }
}
