package Practice;

import java.util.Scanner;

public class methodCreation_soru1 {
    public static void main(String[] args) {
        System.out.println("Bir Sayı Giriniz");


        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        int hesaplanansayi = sayi;
        int yuzler, onlar, birler;



        yuzler = hesaplanansayi / 100;   // Yüzler Basamağı
        hesaplanansayi = hesaplanansayi - (100 * yuzler);

        onlar = hesaplanansayi / 10;    // Onlar Basamağı
        hesaplanansayi = hesaplanansayi - (10 * onlar);

        birler = hesaplanansayi;     // Birler Basamağı

        sifirdanKucukBuyuk(hesaplanansayi);
        tekmiCiftMi(hesaplanansayi);
        basamakToplami(hesaplanansayi,yuzler,onlar,birler);

    }

    private static int basamakToplami(int sayi, int yuzler, int onlar, int birler) {
        if (sayi >=100){
            System.out.print("basamaktaki rakamlar toplamı:"+ (yuzler+onlar+birler) );
        }else{
            System.out.print("biler basamağı:" + birler);
        }
        System.out.println("sayı: " + sayi);
        return yuzler+onlar+birler;
    }

    private static void tekmiCiftMi(int sayi) {
        System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");
    }

    private static void sifirdanKucukBuyuk(int sayi) {
        System.out.println(sayi < 0 ? "sıfırdan kucuk" : "sıfırdan buyuk");
    }

}
