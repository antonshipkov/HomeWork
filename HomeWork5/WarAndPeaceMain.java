package HomeWork1.HomeWork5;

import java.io.File;
import java.io.FileNotFoundException;



public class WarAndPeaceMain {
    public static void main(String[] args) throws FileNotFoundException {
        WarAndPeace war = new WarAndPeace();

        // используем path.separator для корректной загрузки из различных систем
        String separator = File.separator;
        String path = war.readFile(separator + "C:" + separator + "Users" +separator + "Anton"
                + separator +  "IdeaProjects" + separator + "jd1" + separator + "HomeWork"
                + separator + "src" + separator + "HomeWork1" + separator + "HomeWork5" + separator +
                "Война и мир_книга.txt");

        //System.out.println("Текст книги : "+path);



        EasySearch easySearch = new EasySearch();
        //RegExSearch regExSearch = new RegExSearch();

        System.out.println(easySearch.search(path,"война"));
        System.out.println(easySearch.search(path,"и"));
        System.out.println(easySearch.search(path,"мир"));
       //System.out.println(regExSearch.search(path,"и"));
      //System.out.println(regExSearch.search(path,"и"));
       // System.out.println(regExSearch.search(path,"мир"));

    }



}
