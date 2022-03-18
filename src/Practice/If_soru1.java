package Practice;

import java.util.Scanner;

public class If_soru1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("tam sayi giriniz");

        int sayi1= scan.nextInt();
        if (sayi1%2==0) {System.out.println("cift sayı");} else {
            System.out.println( "tek sayi");}

    }
}
