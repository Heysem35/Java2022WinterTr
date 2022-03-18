package JavaPractice;

import java.util.Scanner;

public class cidinin {public static void main(String[] args) {


    Scanner klavye = new Scanner(System.in);
    System.out.println("Bir Sayı Giriniz");
    int sayi = klavye.nextInt();
    sifirdanKucukBuyuk(sayi);
    tekmiCiftMi(sayi);
    basamakDegeri(sayi);
}
    private static void basamakDegeri( int sayi) {
        if (sayi>=100)
            if(sayi<=999)
                System.out.println("basamak rakamları toplamı:" + (((sayi%10)) + ((((sayi %10))))  + (sayi%10)));
        if (sayi<100)
            System.out.println("birler basamagi:"+ (sayi%10));
    }
    private static void tekmiCiftMi(int sayi) {System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");
    }
    private static void sifirdanKucukBuyuk(int sayi) {
        System.out.println(sayi < 0 ? "sıfırdan kucuk" : "sıfırdan buyuk");
    }
}
