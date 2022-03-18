package day02_variables;

public class Practice {
    public static void main(String[] args) {
        //1 farklı 3 data türündevariable oluştur yaz//

        boolean yasliGenc= true;
        char sınıf= '5';
        int not= 80;
        System.out.println(yasliGenc);
        System.out.println(sınıf);
        System.out.println(not);

        //2 isim ve soyisim için 2 variable oluştur ve yazdırın //

        String isminiz= "heysem";
        String soyIsminiz= "isik";

        System.out.println("isminiz:" + isminiz);
        System.out.println("Soyisminiz:" + soyIsminiz);

        //3 iki farklı data typeta iki variable oluşturun ve toplamlarını yazdırın//

        byte sicaklik= 8;
        short depth= -45;
        System.out.println(sicaklik+depth);

        //4 bir tamsayi ve bir onadalikli variable oluşturun ve bunların toplamlarını yazdırın

        int tam= 10;
        float decimal=8.3f;
        System.out.println(tam+decimal);

        int sayı=5;
        char harf= 'a';
        System.out.println(sayı+harf);

        int sayi1= 10;
        int sayi2= 20;

        System.out.println( "swaptan önce sayi1:" + sayi1 + " ,sayi2:" + sayi2);

        int temp= sayi1;
        sayi1= sayi2;
        sayi2= temp;


        System.out.println("swaptan sonra sayi1:" + sayi1 + " ,sayi2:" + sayi2);





    }
}
