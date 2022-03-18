package advancedJavaPractice;

public class ForLoop_Q3 {


    public static void main(String[] args) {
        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        //basarılı

        String cumle = "Java daha da cok havalı";

        int sayac = 0;


        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a') {
                sayac++;
            }else if(cumle.charAt(i)=='c'){ break;

            }


        }
        System.out.println("cümledeki ilk c harfine kadarki a harfi sayısı :" + sayac);
    }
}
