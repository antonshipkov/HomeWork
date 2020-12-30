package HomeWork1;

public class HomeWork1_2 {
    public static void main(String[] args) {
        double a = 8;
        double b = 2;
        int c = 5;

        System.out.println(c + b / a); // Результат 5.25 приоритет '/'
        System.out.println((5.0 + 2)/ a); // Результат 0.875 приоритет '()'
        System.out.println((5.0 + b++) / a); //Результат 0.875 b++ в приоритете
        System.out.println((5.d + b++) / --a); // Результат 1.143, т.е. (5+3)/7
       // System.out.println((5 * b >> b++) / --a); // Результат 0, (5*4 сдвиг 4++) / 6
     //   System.out.println((5 + 7 > 20 ? 68 : 22 * b >> b++) / --a); //Результат 0
      //  System.out.println(5 + 7 > 20 ? 68 >= 68 : 22 * b >> b++ / --a); //Ошибка
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); //Результат false, всегда будет false
       // boolean c = true;
      //  boolean d = false;
      //  System.out.print(c&&!d); // Результат true, оба условия совпали




    }
}
