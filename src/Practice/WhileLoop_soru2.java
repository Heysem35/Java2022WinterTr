package Practice;

public class WhileLoop_soru2 {
    public static void main(String[] args) {

        //For ve While Loop kullanarak 3 basamaklı sayılardan 15,20 ve 90 a tam bölünenleri yazdırın

        int num = 100;

        while (num>=100 && num < 1000) {
            if (num % 15 == 0 || num % 20 == 0 || num % 90 == 0) {
                System.out.print(" "+ num);

            }
            num++;
        }
    }



    }








