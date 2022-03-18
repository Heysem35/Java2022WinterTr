package day11_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1= "java bir baska guzel";

        System.out.println(str1.indexOf('J')); //0

        System.out.println(str1.indexOf("l")); //19 (ister bir harf ister metin bir stringin index sayısını verir

        System.out.println(str1.indexOf("aska")); //aska nın ilk harfinin indexi 9 u verir

        // aynı harften birden fazla varsa bulduğu ilk eşleşmenin indexini döndürür


    }
}
