package Hometask7;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберете банк: \n1) НацБанк \n2) Альфа-Банк \n3) БПС-Банк \n" +
                "4) БелАгро-Банк (ввод даты)");
        switch (Integer.parseInt(reader.readLine())){
            case 1:
                printRates(new NBRBLoader());
                save(new NBRBLoader());
                break;
            case 2:
                printRates(new AlfaLoader());
                save(new AlfaLoader());
                break;
            case 3:
                printRates(new BPSLoader());
                save(new BPSLoader());
                break;
            case 4:
                dateValue(new BelAgroLoader(),args);
                save(new BelAgroLoader());
                break;
        }

    }

    public static void printRates(SiteLoader loader){
        System.out.println("EURO: " + String.format("%.5f", loader.load(SiteLoader.Currency.EUR)));
        System.out.println("RUB: " + String.format("%.5f", loader.load(SiteLoader.Currency.RUB)));
        System.out.println("USD: " + String.format("%.5f", loader.load(SiteLoader.Currency.USD)));
    }
    public static void dateValue(SiteLoader loader, String[] args){
        mapPrint(SiteLoader.Currency.USD,loader.loadDate(SiteLoader.Currency.USD,args));
        mapPrint(SiteLoader.Currency.RUB,loader.loadDate(SiteLoader.Currency.RUB,args));
        mapPrint(SiteLoader.Currency.EUR,loader.loadDate(SiteLoader.Currency.EUR,args));
    }

    public static ArrayList<Double> returnValue(SiteLoader loader){
        ArrayList<Double> arrayList = new ArrayList();
        arrayList.add(loader.load(SiteLoader.Currency.EUR));
        arrayList.add(loader.load(SiteLoader.Currency.RUB));
        arrayList.add(loader.load(SiteLoader.Currency.USD));
        return arrayList;
    }

    public static void writeIn(File file, ArrayList<Double> arrayList){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Double aDouble : arrayList) {
                writer.write(aDouble.toString() + "\n");
            }
        } catch (IOException e){
            System.out.println("Произошла ошибка");
        }
    }

    public static void mapPrint(SiteLoader.Currency currency, Map<String, Double> map ){
        for (Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(currency + " | " + entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("------------------------");
    }

    public static void save(SiteLoader loader) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите куда вы хотите сохранить курсы валют, либо они сохраняться рядом " +
                "с запускаемой программой (при нажатии клавиши enter).");
        String path = reader.readLine();
        if (loader instanceof BelAgroLoader){

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
}
