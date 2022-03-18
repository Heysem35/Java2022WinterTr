package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        // kullanıcıdan kacıncı ay oldugunu alıp switch ile mevsimi yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.print("ayno girin");
        int ayno = scan.nextInt();

        switch (ayno) {
            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("gecerli ay no girin");}
    }
}
