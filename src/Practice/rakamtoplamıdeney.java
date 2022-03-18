package Practice;

import java.util.Scanner;

public class rakamtoplamıdeney {
    //kullanıcadan aldıgınız dört basamaklı bir sayının basamaklar toplamını bulunuz

    // kullanicidan aldiginiz 4 basamakli bir sayinin
    // basamaklardaki rakamlar toplamini bulunuz
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("dort bamasakli bir sayi giriniz;");

        int sayi= scan.nextInt();

        int rakam= 0;
        int rakamlarToplami= 0;

        rakam= sayi%10;                 //step 1
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam= sayi%10;                //step2
        rakamlarToplami+= rakam;
        sayi/=10;

        rakam= sayi%10;                 //step3
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam= sayi%10;
        rakamlarToplami+= rakam;
        sayi/=10;


        System.out.println("rakamlar toplami: " + rakamlarToplami);
    }

}
