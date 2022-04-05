package JavaPractice.practice_basic_day03;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        double uzunluk = 200;
        uzunlukCevirici(uzunluk);

    }

    private static void uzunlukCevirici(double uzunluk) {

        double metreuzunluk= uzunluk/100;
        double kmuzunluk= uzunluk/100000;

        System.out.println( uzunluk+"cm " + "= "+ metreuzunluk +"m ,"+kmuzunluk + " km");



    }






}