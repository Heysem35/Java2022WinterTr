package Replit;

public class ENG_For_while_4 {
    /*Write a return method that accepts an integer as input and calculates factorial and prints like output.

    Input : 6

    Output: 6!=65432*1=720

     */
    public static void main(String[] args) {

        int num=6;

        faktoryelyap(num);

    }

    private static void faktoryelyap(int num) {

        int fak =1;
        for (int i = 1; i <= num; i++) {  fak=fak*i;



        }
        System.out.println(num + "! =" + fak);
    }


}
