package Hometask7;

public class Test {
    public static void main(String[] args) {

       printRates(new NBRBLoader());
        //printRates(new AlfaLoader());
      // printRates(new BelarusBankLoader());
        //printRates(new BelAgroLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}
