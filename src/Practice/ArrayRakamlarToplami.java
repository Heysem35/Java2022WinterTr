package Practice;

import java.util.Arrays;

public class ArrayRakamlarToplami {
    public static void main(String[] args) {

        int arr [][]= {{3,5,7},{2,4,8,10}};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr [i][j];

            }

        }
        System.out.println(toplam); // bu MDA içindeki elementlerin toplamını verir

        System.out.println(Arrays.deepToString(arr)); // bu, MD arrayin içindeki bütün elementleri yazdırır
    }
}
