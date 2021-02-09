package HomeWork1.HomeWorkДопСтрокиЧислительные;

import java.util.concurrent.TimeUnit;


public class MillisecondsMain {
    public static void main(String[] args) {

        //передаем миллисекунды с false и true в метод toHoursMinuteSecondMilliseconds
        System.out.println(toHoursMinuteSecondMilliseconds(7789001,false));
        System.out.println(toHoursMinuteSecondMilliseconds(7789001,true));

    }
     // метод переводит миллисекунды в необходимый нам формат, используем enum TimeUnit
    public static String toHoursMinuteSecondMilliseconds  (long milliseconds, boolean shortFormat){

        long hours = TimeUnit.MILLISECONDS.toHours(milliseconds) % 24;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds) % 60;
        long millis = milliseconds % 1000;

        if (milliseconds < 0) {
            throw new IllegalArgumentException("Время должно быть больше нуля!");
        }
         //false возращаем в нужном формате
        if (!shortFormat){

            return String.format("%d часа %d минут %d секунд %d миллисекунда", hours, minutes, seconds, millis);
        }
        // true возвращмем в нужном формате
        else {

            return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, millis);

        }


    }

}
