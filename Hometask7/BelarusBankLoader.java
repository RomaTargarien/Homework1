package Hometask7;

public class BelarusBankLoader extends SiteLoader {
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://belarusbank.by/api/kursExchange" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        //TODO дописываем код сюда
        return 0;
    }
}
