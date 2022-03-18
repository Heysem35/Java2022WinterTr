package day12_stringManipulation;

public class C04_endWith {
    public static void main(String[] args) {
        //Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email = "mulkiyeayboy@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("adres girin");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("adres kaydedildi");
        } else {
            System.out.println("yazımı kontrol edin");
        }


    }
}
