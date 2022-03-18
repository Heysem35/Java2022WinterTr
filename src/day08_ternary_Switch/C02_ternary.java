package day08_ternary_Switch;

import java.util.Scanner;

public class C02_ternary  {
    public static void main(String[] args) {
        //kullanıcan pozitif tam sayi alıp sonucu tesayi cift sayi yazdırın
        Scanner scan= new Scanner(System.in);

        System.out.println("pozitif tam sayı girin");

        int tamsayi= scan.nextInt();

        System.out.println(tamsayi%2==0? "sayi cift": "sayi tek");
    }}
