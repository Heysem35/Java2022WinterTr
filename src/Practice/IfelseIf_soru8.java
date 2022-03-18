package Practice;

import java.util.Scanner;

public class IfelseIf_soru8 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("maas beklentiniz");

        int maas = scan.nextInt();
        if (maas >= 80000) {
            System.out.println("kabul ediyorum");

        }else if (maas >= 60000 && maas<80000) {
            System.out.println("konusabiliriz");

        }else {
            System.out.println("kabul edemem");

        }


    }
}
