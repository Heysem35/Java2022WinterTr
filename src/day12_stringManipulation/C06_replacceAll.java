package day12_stringManipulation;

public class C06_replacceAll {
    public static void main(String[] args) {

        //kullanıcıdan isim soyisim alıp bütün harfleri * yapak

        String fullname= "heysem ısık";

        System.out.println(fullname.replaceAll("\\S", "*"));

    }
}
