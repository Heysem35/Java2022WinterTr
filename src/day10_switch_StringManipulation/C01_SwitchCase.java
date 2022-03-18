package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //kullanıcıdan ay numarasını alıp istenen ay ismini yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.print("kacıncı ay oldugunu giriniz");

        int ayno= scan.nextInt();

        //bu soruyu if else ile yaparsak 12-13 if else yazmamız gerekir
        // instead, switch - case kullanabiliriz

        switch (ayno) {

            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println( "aralık");
                break;
            default:
                System.out.println("gecerli ay no girin");


        }


    }
}
