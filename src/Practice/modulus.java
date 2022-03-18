package Practice;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println( "sayı giriniz");

        int sayi= scan.nextInt();

int tekcift = sayi%2;


        String sayi1 = String.valueOf(sayi) ;         //Yol 1
        //String sayi2 = Integer.toString(sayi) ;       //Yol 2
        //String sayi3 = sayi+" " ;                     //Yol 3


        System.out.println("girilen sayinin tek cift durumu:"+ String.valueOf(sayi1));
    }

}
