package HomeWork1;

public class HomeWork1_2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println(132>>6);
        System.out.println(5d + (2d / a)); // Результат 5.25 для получения верного результата добавил d
        System.out.println((5.0 + 2)/ a); // Результат 0.875 для получения верного результата добавил .0
        System.out.println((5.0 + b++) / a); //Результат 0.875 b++ при сложении дает 7, т.е. итог как выше
        System.out.println((5.d + b++) / --a); // Результат 1.143, т.е. (5+3)/7
        System.out.println((5 * b >> b++) / --a); // Результат 0, (5*4 сдвиг 4++) / 6
        System.out.println((5 + 7 > 20 ? 68 : 22 * b >> b++) / --a); //Результат 0
        System.out.println(5 + 7 > 20 ? 68 >= 68 : 22 * b >> b++ / --a); //Результат 66
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); //Результат false, всегда будет false
        boolean c = true;
        boolean d = false;
        System.out.print(c&&!d); // Результат true, оба условия совпали

    }
}
