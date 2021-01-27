package HomeWork1.HomeWork5;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public List<Integer> search(String text, String word) {
        int counter = 0;
        List<String> newList = new LinkedList<>();


        Pattern pattern = Pattern.compile("\\b" + word + "\\b([^-]|$)", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);

        // добавляем  word в массив,считаем общее колличество
        while (matcher.find()) {
            newList.add(matcher.group());
            counter++;

        }
        return Collections.singletonList(counter);

    }
}



