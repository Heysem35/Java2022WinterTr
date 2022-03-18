package Practice;

import java.util.Scanner;

public class scan_soru7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println( "isim");

        char isim= scan.next().charAt(3);

        System.out.println(isim);
    }
}
