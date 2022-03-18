package day11_StringManipulation;

import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp başharfini ve sonharfini buyuk harflerle yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("isim girin");

        String isim= scan.nextLine();
        System.out.println("ilk harf:" + isim.toUpperCase().charAt(0)
        + "son harf:"+ isim.toUpperCase().charAt(isim.length()-1));


    }
}
