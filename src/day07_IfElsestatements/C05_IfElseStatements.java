package day07_IfElsestatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz

        Scanner scan= new Scanner(System.in);

        System.out.println("gün giriniz");

        String gunIsmi= scan.next().toUpperCase();

        if( gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println( "girilen gun haftasonu");

        } else {
            System.out.println( "girilen gun haftaici");}
    }
}
