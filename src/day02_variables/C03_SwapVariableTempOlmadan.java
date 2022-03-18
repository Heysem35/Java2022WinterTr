package day02_variables;

public class C03_SwapVariableTempOlmadan {
    public static void main(String[] args) {

        int sayi1= 10;
        int sayi2= 20;
        System.out.println("swaptan önce sayi1:" + sayi1 + " ,sayi2:" + sayi2);

        sayi1= sayi1 + sayi2;
        sayi2= sayi1 - sayi2;
        sayi1= sayi1- sayi2;

        System.out.println("swaptan sonra sayi1:" + sayi1 + " ,sayi2:" + sayi2);






    }

    /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
}
