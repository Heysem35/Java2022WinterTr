package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str= "Java Guzeldir";
        // Biz string metodlarını arka arkaya kullanabilriz
        // mesela 2nci kelimenin ilk harfini küçük yazdıralim
        // str.charAt(5); yazdığımızda sonuç artık char olur.
        // O yüzden string ile ilgili methodları charAt'ten önce kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
    }
}
