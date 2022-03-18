public class C02_SwapVariables {
    public static void main(String[] args) {
        int sayi1= 10;
        int sayi2= 20;

        System.out.println( "swaptan once sayi1: " + sayi1 + ",sayi2 : "+sayi2);

        //1 boş variable oluştur sayi1 i ona ata

        int temp=sayi1;

        //2 sayi1 e yeni değerini atayalım

        sayi1=sayi2;

        // 3 sayi2 ye temp e yedeklediğimiz sayi1 değerini atayalım

        sayi2=temp;

        System.out.println("swaptan sonra sayi1: " + sayi1 + ",sayi2 : "+sayi2);

    }
}
