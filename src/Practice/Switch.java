package Practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //kullanıcıdan haftanın kacıncı gunu oldugunu alın ve gun ismini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("haftanın kacıncı gunu");
        int daynum = scan.nextInt();

        switch (daynum) {
            case 1:
                System.out.println("ptesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("crs");
                break;
            case 4:
                System.out.println("pers");
                break;
            case 5:
                System.out.println("cuma");
                break;
            default:
                System.out.println("haftasonu");}
        }
    }
