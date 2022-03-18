package day08_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //sayının + - olup olmadıgını kontrol edip
        // 0 veya + ise tek mi cift mi
        // - ise -100den büyük mü kücük mü
        //boyle bir ternary yazın

        int sayi= 20;

        if (sayi>=0) {
            if (sayi%2==0) {System.out.println("sayi pozitif cift sayı");}
            else {System.out.println("sayi pozitif tek sayi");}
        }else { if (sayi<= -100){System.out.println("Sayi -100 den kucuk negatif sayi");}
                else { System.out.println("Sayi -100'den buyuk negatif sayi");}
        }
        String sonuc= sayi>=0 ?
                (sayi%2==0 ? "pozitif cift sayi": "pozitif tek sayi") :
                (sayi<-100 ? "-100den kucuk negatif sayi":"-100den buyuk negatif sayi");
    }
}
