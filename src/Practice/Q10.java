package Practice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        //kullanıcıdan5 sayı alın en büyüğünü yazdırın

        int sayac=0;
        int sayi1=0,sayi2=0,sayi3=0,sayi4=0,sayi5=0;

        while(sayac<=5) {
            Scanner scan= new Scanner (System.in);
            System.out.print("sayı giriniz: ");
            int sayi = scan.nextInt();

            sayi1= sayi;

            sayac++;

        }



    }
}
