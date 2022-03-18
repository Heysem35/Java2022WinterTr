package day08_ifElseifStatements;

import java.util.Scanner;

public class C03_Emeklilik {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("cinsiyet"+"\nKadın icin K \nErkek icin E");

        char cins= scan.next().toUpperCase().charAt(0);

        System.out.println("yas:");

        double yas= scan.nextDouble();

        if (cins=='K') {
            if (yas<0 || yas>120) {
                System.out.println( "gecersiz yas");

            }else if (yas<60) {
                System.out.println("emekli olamazsın \ndaha" +(60-yas) + "yıl calısman lazım");



            }else {
                System.out.println("emekli olabilirsin");


        } }else if (cins=='E') {
            if (yas < 0 || yas > 120) {
                System.out.println("gecersiz yas");

            } else if (yas < 65) {
                System.out.println("emekli olamazsın \ndaha" + (65 - yas) + "yıl calısman lazım");


            } else {
                System.out.println("emekli olabilirsin");


            }


        }   }
}
