package Replit;

public class Eng_ForWhile_1 {
    public static void main(String[] args) { //basarılı

        char ch= 'e';

        String str= "en guzel sey sevmek";

        int sayac=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch) sayac++;

        }
        System.out.println("girdiğiniz ifadede "+ sayac + " tane "+ ch + " karakteri kullanılmıştır");
    }
}
