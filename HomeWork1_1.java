package HomeWork1;

public class HomeWork1_1 {
    public static void main(String[] args) {
        int x = 42;   // Двоичный код 00101010, Побитовое унарное отрицание числа: 11010101
        int y = 15;   // Двоичный код 00001111, Побитовое унарное отрицание числа: 11110000
        int a = - 42; // Двоичный код 11010110, Побитовое унарное отрицание числа:101001
        int b = - 15;  //Двоичный код 11110001, Побитовое унарное отрицание числа:1010011110
        double e = 42.5;//Двоичный код: 100000001000101010000000000000000000000000000000000000000000000
        String bin_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        String bin_y = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        String bin_a = String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(" ", "0");
        String bin_b = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        long numberBits = Double.doubleToLongBits(e);
        String Bin_e = Long.toBinaryString(numberBits);
        int x1 = ~x;
        String notx =String.format("%8s", Integer.toBinaryString(x1 & 0xFF)).replace(' ', '0');
        int y1 = ~y;
        String noty =String.format("%8s", Integer.toBinaryString(y1 & 0xFF)).replace(' ', '0');
        int a1 = ~a;
        String nota =String.format("%8s", Integer.toBinaryString(a1 & 0xFF)).replace(' ', '0');
        int b1 = ~b;
        String notb =String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');

        int xy = x & y;
        String bin_xy = String.format("%8s", Integer.toBinaryString(xy)).replace(' ', '0');
        //Побитовый AND чисел 42 и 15 дает: 00001010, результат 10

        int xyOR = x / y;
        String bin_xyOR = String.format("%8s", Integer.toBinaryString(xyOR)).replace(' ', '0');
        //Побитовый OR чисел 42 и 15 дает: 00000010, результат 2

        int xyXOR = x ^ y;
        String bin_xyXOR = String.format("%8s", Integer.toBinaryString(xyXOR)).replace(' ', '0');
        //Побитовый XOR чисел 42 и 15 дает: 00100101, результат 37

        int xy_shiftleft = x << y;
        String bin_xy_shiftleft = String.format("%8s", Integer.toBinaryString(xy_shiftleft)).
                replace(' ', '0');
        //Побитовый shiftleft чисел 42 и 15 дает: 101010000000000000000, результат 1376256

        int xy_shiftright = x >> y;
        String bin_xy_shiftright = String.format("%8s", Integer.toBinaryString(xy_shiftright)).
                replace(' ', '0');
        //Побитовый shiftright чисел 42 и 15 дает: 00000000, результат 0


        int ab = a & b;
        String bin_ab = String.format("%8s", Integer.toBinaryString(ab)).replace(' ', '0');
        //Побитовый AND чисел -42 и -15 дает: 11111111111111111111111111010000, результат -48

        int abOR = a / b;
        String bin_abOR = String.format("%8s", Integer.toBinaryString(abOR)).replace(' ', '0');
        //Побитовый OR чисел -42 и -15 дает: 00000010, результат 2


        int abXOR = a ^ b;
        String bin_abXOR = String.format("%8s", Integer.toBinaryString(abXOR)).replace(' ', '0');
        //Побитовый XOR чисел -42 и -15 дает: 00100111, результат 39

        int ab_shiftleft = a << b;
        String bin_ab_shiftleft = String.format("%8s", Integer.toBinaryString(ab_shiftleft)).
                replace(' ', '0');
        //Побитовый shiftleft чисел -42 и -15 дает: 11111111101011000000000000000000, результат -5505024


        int ab_shifright = a >> b;
        String bin_ab_shiftright = String.format("%8s", Integer.toBinaryString(ab_shifright)).
                replace(' ', '0');
        //Побитовый shiftright чисел -42 и -15 дает: 11111111111111111111111111111111, результат -1

        //1.5 побитовые операторы не применимы  к double


    }
}
