package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        //verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazınız

        char ilkharf= 'm';
        char sonharf= 't';

        for (char i = ilkharf; i <= sonharf ; i++) {
            System.out.print(i+" ");

            //ilkharften başlayıp son harfe kadar body de istediğim şeyi yapmaya
            // her seferinde 1 artırarak devam et demektir.
        }
    }
}
