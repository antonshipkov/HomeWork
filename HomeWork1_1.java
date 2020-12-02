package HomeWork1;

public class HomeWork1_1 {
    public static void main(String[] args) {
        int x = 42; // Двоичный код 101010
        int y = 15; // Двоичный код 1111
        System.out.println(x | y); // Двоичный код 101111, результат 47
        System.out.println(x & y); // Двоичный код 1010, результат 10
        System.out.println(x ^ y); // Двоичный код 100101, результат 37
        System.out.println(-x | -y); // Двоичный код 11111111111111111111111111110111, результат -9
        System.out.println(-x & -y); // Двоичный код 11111111111111111111111111010000, результат -48
        System.out.println(-x ^ -y); // Двоичный код 100111 , результат 39
    }
}
