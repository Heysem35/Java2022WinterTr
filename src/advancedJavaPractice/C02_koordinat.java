package advancedJavaPractice;

import java.util.Scanner;

public class C02_koordinat {
    public static void main(String[] args) {
        // alacağınız koordinat noktasının hangi bölgede olduğunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("x ve y değer girin:");

        int x= scan.nextInt();
        int y= scan.nextInt();

        if (x>0 && y>0){
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("girdiginiz degerler orjin'dedir");

    }
}
