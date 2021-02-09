package HomeWork1.HomeWorkДопСтрокиЧислительные;


public class toWeekMain {
    public static void main(String[] args) {

        toWeeks(5);
        toWeeks(10);
       toWeeks(28);
       toWeeks(82); // передаем количество дней в метод toWeeks
        toWeeks(147);
        toWeeks(177);

    }
    // метод считает количество недель исходя из количества дней
    // для правильного окончания в слове 'неделя' определяем последнюю цифру переменной weeks, а так же опредеделяем
    // сколько цифр в переменной weeks (quantitynumbers) 1 , 2 или от 3 и более и далее для каждого варианта прописываем
    // необходимые окончания
    public static void toWeeks (int sum){
        int weeks = Math.round(sum/7);
        int lastnum = weeks%10;
        int quantitynumbers = String.valueOf(Math.abs(weeks)).length();
        final boolean b = lastnum == 0 | lastnum == 5 | lastnum == 6 | lastnum == 7 | lastnum == 8 | lastnum == 9;

        if(quantitynumbers==1){

            if (b){

                System.out.println(weeks + " недель");
            }
            else if (lastnum == 1){
                System.out.println(weeks + " неделя");
            }
            else {
                System.out.println(weeks + " недели");
           }

        }
        else if(quantitynumbers == 2){
            if (weeks/10 != 1){
                if (b){

                    System.out.println(weeks + " недель");
                }
                else if (lastnum == 1){
                    System.out.println(weeks + " неделя");
                }
                else {
                    System.out.println(weeks + " недели");
                }
            }
            else {
                System.out.println(weeks + " недель");
            }
        }
        else {
            if (b){

                System.out.println(weeks + " недель");
            }
            else if (lastnum == 1){
                System.out.println(weeks + " неделя");
            }
            else {
                System.out.println(weeks + " недели");
            }
        }

    }

}
