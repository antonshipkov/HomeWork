package HomeWork1.HomeWork6;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// Реализация записи курсов валют в txt файл
public class StringToFile {

    // Метод принимает значения Eur, Rub,Usd
    public static void stringToFile(String Eur, String Rub, String Usd ) throws IOException {
        String path = "";
        String separator = File.separator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Если хотите сохранить файл по указанному Вами пути, нажмите 1 ");
        System.out.println("Если хотите что бы файл сохранился автоматически сам нажмите 2 ");
        String choice = sc.nextLine();
        //спрашиваем 2 варианта, создаем txt с консоли или по умолчанию в файл
        switch (choice) {
            case "1":
                System.out.println("Введите путь и имя файла");
                path=sc.nextLine();


                try {
                    File file = new File(path);
                    if(!file.exists()){ //переписал код, что бы можно было не перезаписывать файл
                        System.out.println("Надо записать новый файл");
                        file.createNewFile();
                    }

                    //переписал код, курсы добавляются в существующий файл по порядку
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                    out.write(Eur + "\n");
                    out.write(Rub + "\n");
                    out.write(Usd + "\n");
                    out.flush();
                    out.close();
                    System.out.println("Файл записан");
                } catch ( IOException e) {
                    System.out.println("Что то пошло не так");
                    e.printStackTrace();
                }
                break;
            case "2":
                System.out.println("Запишем файл по умолчанию");
                try {
                        path = "C:" + separator + "Users" +separator + "Anton"
                        + separator +  "IdeaProjects" + separator + "jd1" + separator + "HomeWork"
                        + separator + "src" + separator + "HomeWork1" + separator + "HomeWork6" + separator +
                        "ratesNBRB.txt";
                        File file = new File(path); //переписал код, курсы добавляются в существующий файл по порядку
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                        out.write(Eur + "\n");
                        out.write(Rub + "\n");
                        out.write(Usd + "\n");
                        out.close();

                System.out.println("Файл записан");
                } catch ( IOException e) {
                    System.out.println("Что то пошло не так");
                    e.printStackTrace();
                }

                break;

            default:
                System.out.println("Упс ввели не 1 и 2");

        }


        sc.close();


    }

}
