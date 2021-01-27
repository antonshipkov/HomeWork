package HomeWork1.HomeWork5;


import java.util.Collections;
import java.util.List;

public class EasySearch implements ISearchEngine {

    @Override
    public List<Integer> search(String text, String word) {

        int count = 0;
        word = " " + word + " ";
        int index = 0;
        while(index != -1){
            index = text.indexOf(word, index + 1);  // Slight improvement
            if (index != -1) {
                count++;
            }

        }
        return Collections.singletonList(count);


    }
}
