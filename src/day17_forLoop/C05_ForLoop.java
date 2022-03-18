package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //100den küçük tamsayi al
        // 1den başlayıp girilen sayıya kadar 3ün katı olanları yazdır

        int sayi = 55;
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
