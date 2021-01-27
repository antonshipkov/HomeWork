package HomeWork1.HomeWork5;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.stream.Collectors;


public class WarAndPeace {

    public static String readFile(String path)  {
        //Получаем тестовой файл из Main по ссылке path, используем используем path.separator
        // для корректной загрузки
        File file = new File(path);
        Scanner scanner = null;
        StringBuilder text = new StringBuilder();
        int count = 0;
        try {
            scanner = new Scanner(file);
            //Сканируем текст от начала до конца
            while (scanner.hasNext()) {
                text.append(scanner.nextLine()).append("\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println(text); //проверяем

        LinkedHashSet list = new LinkedHashSet();
        Map<String, Long> wordCount = new LinkedHashMap<>();


        //* \w - класс word characters, по-умолчанию [a-zA-Z_0-9],
        // * Pattern.UNICODE_CHARACTER_CLASS включает так же все прочие буквы
        Pattern word = Pattern.compile( "\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = word.matcher(text.toString());

            // добавляем в Set уникальные слова ,считаем общее колличество слов
            while ( matcher.find() ) {
                list.add(matcher.group());
                count++;

            // Метод позволяет посчитать колличество всех уникальных слов и их посчитать, заполняем Map
                String newword = matcher.group().toLowerCase();
                wordCount.merge( newword, 1L, Long::sum );

            }
        //System.out.println(list); //Все уникальных слова
        System.out.println("Колличество уникальных слов:  "+count);

        // передаем в List массив Map
        List<Map.Entry<String, Long>> entries = new ArrayList<>(wordCount.entrySet());

        // сортируем в List все уникальные слова по убыванию по колличеству слов
        List<Map.Entry<String, Long>> allUniqueWords = entries.stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        //System.out.println("Сумма всех уникальных слов по убыванию:");
        allUniqueWords.forEach(System.out::println);

        // сортируем в List топ 10 уникальных слов по убыванию по колличесву слов
        List<Map.Entry<String, Long>> top10Words = entries.stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10) //настраиваемое значение
                .collect(Collectors.toList());

        //System.out.println("Колличество топ 10 уникальных слов:");
        top10Words.forEach(System.out::println);

        assert scanner != null;
        scanner.close();
           return text.toString();
    }

}
