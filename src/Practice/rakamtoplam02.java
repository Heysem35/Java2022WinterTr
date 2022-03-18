package Practice;

import java.util.Scanner;

public class rakamtoplam02 {
    public static void main(String[] args) {

        System.out.println("Bir Sayı Giriniz");
        int binler,yuzler,onlar,birler;
        Scanner klavye=new Scanner(System.in);
        int sayi=klavye.nextInt();



              System.out.println(((sayi / 100) % 10 + (sayi / 10) % 10 + sayi % 10));








      






        rakamtoplayan(sayi);
    }

    private static void rakamtoplayan(int sayi) {if (sayi > 100) {
        System.out.println("basamaktaki rakamlar toplami:");
    }else{
        System.out.println("birler basamagı:");}
    }
}
