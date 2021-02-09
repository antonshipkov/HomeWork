package HomeWork1.HomeWorkДопСтрокиЧислительные;


public class toStringMain {

    public static void main(String[] args) {


        System.out.println(toString(545.7)); //передаем числа в метод toString
        System.out.println(toString(556543));
        System.out.println(toString(0.75));
        System.out.println(toString(-34578998));
    }

    private final static String[][] power = new String[][]{
            {"0", ""            , ""             ,""              },
            {"1", "тысяча "     , "тысячи "      ,"тысяч "        },
            {"0", "миллион "    , "миллиона "    ,"миллионов "    },


    };

    private final static String[][] digit = new String[][] {
            {""       ,""       , "десять "      , ""            ,""          },
            {"один "  ,"одна "  , "одиннадцать " , "десять "     ,"сто "      },
            {"два "   ,"две "   , "двенадцать "  , "двадцать "   ,"двести "   },
            {"три "   ,"три "   , "тринадцать "  , "тридцать "   ,"триста "   },
            {"четыре ","четыре ", "четырнадцать ", "сорок "      ,"четыреста "},
            {"пять "  ,"пять "  , "пятнадцать "  , "пятьдесят "  ,"пятьсот "  },
            {"шесть " ,"шесть " , "шестнадцать " , "шестьдесят " ,"шестьсот " },
            {"семь "  ,"семь "  , "семнадцать "  , "семьдесят "  ,"семьсот "  },
            {"восемь ","восемь ", "восемнадцать ", "восемьдесят ","восемьсот "},
            {"девять ","девять ", "девятнадцать ", "девяносто "  ,"девятьсот "}
    };
    // метод позволяет перевести любое целое число в текст от - 999 999 999 до 999 999 999
    public static String toString (int sum){
        int i, mny;
        StringBuilder result= new StringBuilder("");
        long divisor; //делитель
        int psum = sum;

        int one  = 1;
        int four = 2;
        int many = 3;

        int hun  = 4;
        int dec  = 3;
        int dec2 = 2;

        if(sum == 0) return "ноль ";
        if(sum <  0){ result.append("минус "); psum = -psum;}

        for(i=0,divisor=1; i<6; i++) divisor *= 1000;

        for(i=5; i>=0; i--){
            divisor /= 1000;
            mny = (int)(psum / divisor);
            psum %= divisor;
            if(mny==0){
                if(i>0) continue;
                result.append( power[i][one] );
            }else{
                if(mny>=100){ result.append( digit[mny/100][hun]); mny%=100; }
                if(mny>=20 ){ result.append( digit[mny/10 ][dec]); mny%=10; }
                if(mny>=10 ){
                    result.append( digit[mny-10 ][dec2]);
                }else{
                    if(mny>=1  ) result.append( digit[mny][ "0".equals(power[i][0]) ? 0 : 1 ] );
                }
                switch(mny){
                    case  1: result.append( power[i][one] ); break;
                    case  2: result.append( power[i][four]); break;
                    default: result.append( power[i][many]); break;
                };
            }
        }
        return result.toString();
    }
    // Метод позволяет учитывать целую и сотую часть числа и перевести в текст

    public static String toString(double num ){
        return toString( (int)num) + "целых "+ toString( (int)(num*100 - ((int)num)*100)) + "сотых";
    }

}



