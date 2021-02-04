package HomeWork1.HomeWork6;

public class BelarusLoader extends SiteLoader {

    @Override
    public double load(Currency currencyName) {
        return load("https://belarusbank.by/api/kursExchange/" + currencyName.getCode(), currencyName);
    }

    @Override
    protected double handle(String content, Currency currencyName) {
        //изпользуем метод indexOf(), метод позволяет взять нужные поля после искомого слова по индексу,
        //в нашем случае курсы валют

        int indexRate1 = content.indexOf("EUR_out");
        int indexRate2 = content.indexOf("RUB_out");
        int indexRate3 = content.indexOf("USD_out");


        String currencyRate = "";

        if (currencyName.getId().equals(Currency.EUR.getId())) {
            currencyRate = content.substring(indexRate1 + 10, indexRate1 + 16);
        }
        if (currencyName.getId().equals(Currency.RUB.getId())) {
            currencyRate = content.substring(indexRate2 + 10, indexRate2 + 16);
        }
        if (currencyName.getId().equals(Currency.USD.getId())) {
            currencyRate = content.substring(indexRate3 + 10, indexRate3 + 16);
        }

        return Double.parseDouble(currencyRate);
    }


}
