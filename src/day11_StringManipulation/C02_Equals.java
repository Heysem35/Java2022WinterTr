package day11_StringManipulation;

public class C02_Equals {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2= "Ali"+" Can";
        System.out.print("str1:" + str1);
        System.out.print("str2:" + str2);

        System.out.print("== ile karsılastır:" +(str1==str2));
        System.out.print("equals ile karsılastır:" +str1.equals(str2));
    }
}
