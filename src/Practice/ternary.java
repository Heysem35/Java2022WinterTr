package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
// girilen sayının 3 veya daha çok basamaklı olup olmadıgını kontrol et sonucu yazdır

        Scanner scan= new Scanner(System.in);
        System.out.print("sayı girin");

        int num1= scan.nextInt();
     String sonuc= num1>=0? num1%2==0? "ciftsayi": "teksayi":
             num1<-100?"yuzden büyük negatif": "yuzden kucuk negatif";

        System.out.println(sonuc);

    }
}
