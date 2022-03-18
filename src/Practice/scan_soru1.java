package Practice;

import java.util.Scanner;

public class scan_soru1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println("birinci tam sayiyi giriniz");
        int num1= scan.nextInt();

        System.out.println("ikinci tam sayiyi giriniz");
        int num2=scan.nextInt();
        System.out.println("birinici tam sayi:" + num1);
        System.out.println( "ikinci tam sayi:"+ num2);

        System.out.println("sayilarin toplami :"+ (num1+num2) );
        System.out.println("sayıların farki :"+ (num1-num2));
        System.out.println("sayilarin carpimi :" + (num1*num2));
    }
}
