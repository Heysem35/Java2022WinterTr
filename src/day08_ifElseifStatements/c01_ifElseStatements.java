package day08_ifElseifStatements;

import java.util.Scanner;

public class c01_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( "karakter girin");

        char karakter= scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z')||(karakter>='a'&& karakter<='z')) {
            System.out.println("harf");

        } else {
            System.out.println( "harf degil");}
    }
}
