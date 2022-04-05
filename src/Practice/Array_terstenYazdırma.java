package Practice;

import java.util.Arrays;

public class Array_terstenYazdırma {
    public static void main(String[] args) {

        //arrayi tersten yazdıran bir metot oluştur

        String arr[] = {"ali", "veli", "can", "cem"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] tersarr = new String[4];
        terstenYazdırmaMetodu(arr, tersarr);
        tersarr = new String[arr.length];

    }

    public static void terstenYazdırmaMetodu(String[] arr,String[] tersarr) {

        for (int i = 0; i < arr.length; i++) {


            tersarr[i]= arr[arr.length-1-i];
        }
        System.out.println("tersten array: "+ Arrays.toString(tersarr));
    }
} //basarılı
