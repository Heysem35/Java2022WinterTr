package day08_ternary_Switch;

public class C03_ternary {
    public static void main(String[] args) {

        //verilen sayinin 3 veya daha cok basamaklı olup olmadıgını kontrol edin sonucu yazdırın //
        int sayi=20 ;

        String sonuc=sayi>=100 ? "sayi 3 basamaklı veya daha buyuk" : "sayı negatif veya 3 basamaktan daha küçük";

        System.out.println(sonuc);
    }
}
