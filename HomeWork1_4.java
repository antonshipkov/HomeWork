package HomeWork1;

public class HomeWork1_4 {
    public static void main(String[] args) {
        boolean weekday = false;
        boolean vocation = true;

        if (sleepIn(weekday, vocation)) {
            System.out.println("Можно спать дальше");
        }
        else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vocation) {
        if (weekday || vocation) {
            return true;
        }
        else {
            return false;
        }

    }
}
