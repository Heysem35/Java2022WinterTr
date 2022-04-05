package Practice;

import java.util.Arrays;

public class Array_01 {
    public static void main(String[] args) {

        // arraydeki en küçük ve en büyük değerleri yazdırın

        int arr[]= {2,5,4,9,6,22,35,7};

        Arrays.sort(arr);
        int enbuyuk= arr[arr.length-1];
        int enkucuk= arr[0];
        System.out.print("Arraydeki en kücük sayı;" + enkucuk + ", " + "en buyuk sayı; "+ enbuyuk);

        //basarılı
    }
}
