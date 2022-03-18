package Practice;

import java.util.Scanner;

public class stringManipulation_soru4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("isim: ");
        String name= scan.nextLine();
        System.out.print("soyisim: ");
        String sname= scan.nextLine();

        if( name.length()> sname.length()) {
            System.out.println("isim daha uzun");
        }else if(sname.length()>name.length()){
            System.out.println("soyisim daha uzun");
        }else {}
    }
}
//basarılı