package day15_methodCreation;

public class C06_methodCreation {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        // iki variable ın degerini toplayan bir method olusturun
        // 1.adım : method adını yazalım
        //2. adım: methoda göndermem gereken argument var mı?

        ikiSayiTopla(a,b);
    }

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verien iki sayının toplamı:"+ (a+b));
    }
}
