package HomeWork1.HomeWork6;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        //изпользуем метод indexOf(), метод позволяет взять нужные поля после искомого слова по индексу,
        //в нашем случае курсы валют

        int indexRate = content.indexOf("Cur_OfficialRate");


        String currencyRate = "";

        if (currencyName.getId().equals(Currency.EUR.getId())) {
            currencyRate = content.substring(indexRate + 18, indexRate + 24);
        }
        if (currencyName.getId().equals(Currency.RUB.getId())) {
            currencyRate = content.substring(indexRate + 18, indexRate + 24);
        }
        if (currencyName.getId().equals(Currency.USD.getId())) {
            currencyRate = content.substring(indexRate + 18, indexRate + 24);
        }
        //System.out.println(scale);
        //System.out.println(content);

        return Double.parseDouble(currencyRate);

    }



}
