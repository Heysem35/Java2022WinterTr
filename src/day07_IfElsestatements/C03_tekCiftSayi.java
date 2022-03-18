package day07_IfElsestatements;

import java.util.Scanner;

public class C03_tekCiftSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "lütfen sayı giriniz");

        int sayi= scan.nextInt();

        if (sayi%2 == 0) {
            System.out.println("girilen sayı çift sayıdır");

            if (sayi%2 != 0) {
                System.out.println("girilen sayı tek sayidir");

            }

        }

    }
}
