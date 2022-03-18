package day22_arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr []={"S","M","A","T"};
        System.out.println(Arrays.toString(arr));

        //sıralama yapmak isterseniz sort metodunu kullanıyoruz

        Arrays.sort(arr);   // arrayin içindekileri küçükten büyüğe sıraya sokar ve array o şekilde kalır
        System.out.println(Arrays.toString(arr)); // AMST
    }
}
