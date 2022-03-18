package day05_mathematicaloperators;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;               //10
        sayi++;
        System.out.println(sayi); //11
        sayi++;                    //12
        System.out.println(++sayi); //13 pre, önce artır sonra yazdır
        System.out.println(sayi++); // 13 post, önce yazdır sonra artır
        System.out.println("post sonrası" + sayi); //14
    }
}
