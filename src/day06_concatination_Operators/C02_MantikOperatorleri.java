package day06_concatination_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8); //false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ; // true

        System.out.println(sonuc1); //true

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8 ;

        System.out.println(sonuc2);  //false

        boolean sonuc3= 5>4 & 7<9 & 6+3==9 & 5+2!=8 ;

        System.out.println(sonuc3); //false

    }
}
