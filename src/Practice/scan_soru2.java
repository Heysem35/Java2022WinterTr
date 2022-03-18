package Practice;

import java.util.Scanner;

public class scan_soru2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println("karenin kenar uzunlugunu girin:");
        double kenar= scan. nextDouble();
        System.out.println("karenin cevresi:"+ 4*kenar + "karenin alani:" + kenar*kenar);
    }
}
