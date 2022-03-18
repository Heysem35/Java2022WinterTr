package Practice;

import java.util.Scanner;

public class scannerPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("sifrenizi giriniz");
        short sifre= scan.nextShort();

        System.out.println("sifreniz:"+ sifre);

    }
}
