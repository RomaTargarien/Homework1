package Hometask7;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    public static Map<String, Double> dataAndValueUSD = new TreeMap<>();
    public static Map<String, Double> dataAndValueRUB = new TreeMap<>();
    public static Map<String, Double> dataAndValueEUR = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберете банк: \n1) НацБанк \n2) Альфа-Банк \n3) БПС-Банк \n" +
                "4) БелАгро-Банк (ввод даты)");
        switch (Integer.parseInt(reader.readLine())) {
            case 1:
                NBRBLoader nbrbLoader = new NBRBLoader();
                printRates(nbrbLoader);
                save(nbrbLoader);
                break;
            case 2:
                AlfaLoader alfaLoader = new AlfaLoader();
                printRates(alfaLoader);
                save(alfaLoader);
                break;
            case 3:
                BPSLoader bpsLoader = new BPSLoader();
                printRates(bpsLoader);
                save(bpsLoader);
                break;
            case 4:
                BelAgroLoader belAgroLoader = new BelAgroLoader();
                dateValue(belAgroLoader, args);
                save(belAgroLoader);
                break;

        }

    }

    // два метода печати (printRates - для обычного курса | mapPrint - для печати дат)
    public static void printRates(SiteLoader loader){
        System.out.println("EURO: " + String.format("%.5f", loader.load(SiteLoader.Currency.EUR)));
        System.out.println("RUB: " + String.format("%.5f", loader.load(SiteLoader.Currency.RUB)));
        System.out.println("USD: " + String.format("%.5f", loader.load(SiteLoader.Currency.USD)));
    }

    public static void mapPrint(SiteLoader.Currency currency,Map<String, Double> map ){
        for (Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(currency + " | " + entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("------------------------");
    }

    // метод для сохранения мапы каждой валюты и вызова печати
    public static void dateValue(SiteLoader loader, String[] args){
        dataAndValueUSD = loader.loadDate(SiteLoader.Currency.USD,args);
        dataAndValueRUB = loader.loadDate(SiteLoader.Currency.RUB,args);
        dataAndValueEUR = loader.loadDate(SiteLoader.Currency.EUR, args);
        mapPrint(SiteLoader.Currency.USD, dataAndValueUSD);
        mapPrint(SiteLoader.Currency.RUB, dataAndValueRUB);
        mapPrint(SiteLoader.Currency.EUR, dataAndValueEUR);
    }

    //метод для сохранения
    public static void save(SiteLoader loader) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите куда вы хотите сохранить курсы валют, либо они сохраняться рядом " +
                "с запускаемой программой (при нажатии клавиши enter).");
        String path = reader.readLine();
        if (loader instanceof BelAgroLoader){
            if (path.equals("")){
                String path2 = ".." + File.separator + "Values.txt";
                File file = new File(path2);
                saveMap(SiteLoader.Currency.USD, dataAndValueUSD, file);
                saveMap(SiteLoader.Currency.RUB, dataAndValueRUB, file);
                saveMap(SiteLoader.Currency.EUR, dataAndValueEUR, file);
            } else {
                File file = new File(path);
                saveMap(SiteLoader.Currency.USD, dataAndValueUSD, file);
                saveMap(SiteLoader.Currency.RUB, dataAndValueRUB, file);
                saveMap(SiteLoader.Currency.EUR, dataAndValueEUR, file);
            }
            return;
        }
        ArrayList<Double> values = returnValue(loader);
        if (path.equals("")){
            String path2 = ".." + File.separator + "Values.txt";
            File file = new File(path2);
            writeIn(file,values);
        } else {
            File file = new File(path);
            writeIn(file,values);
        }
    }

    // метод для сохрения мапы вида (USD | 00.00.0000 | 0.000)
    public static void saveMap(SiteLoader.Currency currency, Map<String, Double> map, File file){
        ArrayList<Double> value = new ArrayList<>(map.values());
        ArrayList<String> date = new ArrayList<>(map.keySet());
        boolean exist = file.exists();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,exist))) {
            for (int i = 0; i < value.size(); i++) {
                writer.write(currency + " | " + date.get(i) + " | " + value.get(i) + "\n");
            }
            writer.write("------------------------\n" );
        } catch (IOException e){
            System.out.println("Произошла ошибка");
        }
    }

    //метод для создания листа валюсты для сохранения
    public static ArrayList<Double> returnValue(SiteLoader loader){
        ArrayList<Double> arrayList = new ArrayList();
        arrayList.add(loader.load(SiteLoader.Currency.EUR));
        arrayList.add(loader.load(SiteLoader.Currency.RUB));
        arrayList.add(loader.load(SiteLoader.Currency.USD));
        return arrayList;
    }

    //метод для сохранения валют из листа
    public static void writeIn(File file, ArrayList<Double> arrayList){
        boolean exist = file.exists();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,exist))) {
            for (Double aDouble : arrayList) {
                writer.write(aDouble.toString() + "\n");
            }
            writer.write("-------\n" );
        } catch (IOException e){
            System.out.println("Произошла ошибка");
        }
    }
}
