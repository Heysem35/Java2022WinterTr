package Practice;

import java.util.Scanner;

public class scan_soru5 {
    public static void main(String[] args) {
        /* kullanicidan ismini soyismini isteyip
        isminiz
        soyisminiz
        kurusumuza katılımınız saglanmıstır, tesekkür ederiz
        seklinde yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("isminiz:");

        String isim= scan. nextLine();


        System.out.println("soyisminiz:");
        String soyisim= scan.nextLine();

        System.out.println("isminiz:"+ isim);
        System.out.println("soyisminiz:"+ soyisim);
        System.out.println("Kursumuza katılımınız saglanmistir, tesekkür ederiz");

    }
}
