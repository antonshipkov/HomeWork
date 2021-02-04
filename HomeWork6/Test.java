package HomeWork1.HomeWork6;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        printRatesNBRB(new NBRBLoader());
        printRatesBelarus(new BelarusLoader());
    }

    public static void printRatesNBRB (SiteLoader loader) throws IOException {
        System.out.println("Курс Национального Банка белорусского рубля к евро: " +
                loader.load(SiteLoader.Currency.EUR));
        System.out.println("Курс Национального Банка белорусского к 100 российским рублям: " +
                loader.load(SiteLoader.Currency.RUB));
        System.out.println("Курс Национального Банка белорусского к доллару США: " +
                loader.load(SiteLoader.Currency.USD));


        String Eur = "Курс Национального Банка белорусского рубля к евро: " +
               loader.load(SiteLoader.Currency.EUR);
        String Rub = "Курс Национального Банка белорусского рубля к 100 российским рублям: " +
               loader.load(SiteLoader.Currency.RUB);
        String Usd = "Курс Национального Банка белорусского рубля к доллару США: " +
                loader.load(SiteLoader.Currency.USD);

        //передаем 3 значения в метод stringToFile класса StringToFile
        StringToFile.stringToFile(Eur,Rub,Usd);
    }
    public static void printRatesBelarus (SiteLoader loader) throws IOException {
        System.out.println("Курс Беларусь Банка белорусского рубля к евро: " +
               loader.load(SiteLoader.Currency.EUR));
        System.out.println("Курс Беларусь Банка белорусского к 100 российским рублям: " +
                loader.load(SiteLoader.Currency.RUB));
        System.out.println("Курс Беларусь Банка белорусского к доллару США: " +
                loader.load(SiteLoader.Currency.USD));

    }


}
