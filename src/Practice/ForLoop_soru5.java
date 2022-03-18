package Practice;

import java.util.Scanner;

public class ForLoop_soru5 {
    public static void main(String[] args) {

        // 100den kücük tamsayı alıp 1den başlayıp
        // girilen sayıya kadar 3 veya 5in katları olan sayıları yazdırın

        Scanner scan= new Scanner(System.in );
        System.out.print("100den küçük bir tamsayi giriniz:");
        int num= scan.nextInt();

        for (int i = 1; i <=num ; i++) { if(i%3==0 || i%5==0){
            System.out.print(i+" ");
        }

        }
    }
}
//başarılı