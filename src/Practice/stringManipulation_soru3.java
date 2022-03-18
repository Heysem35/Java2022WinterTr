package Practice;

import java.util.Scanner;

public class stringManipulation_soru3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("isim girin: ");

        String isim = scan.nextLine();

        if (isim.contains("a")) {
            System.out.println("isim a harfi iceriyor");
        } else {
        }
        if (isim.contains("Z")) {
            System.out.println("isim Z iceriyor");
        } else {
        }
        if (!isim.contains("a") && !isim.contains("Z")) {
            System.out.println("isim a veya Z icermiyor");
        } else {
        }
    }

}
// başarılı