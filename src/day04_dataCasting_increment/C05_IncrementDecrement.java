package day04_dataCasting_increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi+10); //30
        System.out.println(sayi); //20

        sayi=sayi+10;
        System.out.println(sayi); //30
        System.out.println(sayi=sayi+=10); //40
    }
}
