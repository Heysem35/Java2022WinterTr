package day20_scope_Arrays;

public class C03_LocalVariables {



    public static void main(String[] args) {


        // loop ta kullanancagımız variablelere değer atamazsak loop içinde kullanamayız.
        // mecburen, 0 da olsa deger atamalıyız


        int sayi=0;

        for (int i = 0;  i < 10; i++) {
            System.out.println(sayi+1);

        }


    }
}
