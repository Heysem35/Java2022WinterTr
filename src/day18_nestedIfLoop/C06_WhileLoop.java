package day18_nestedIfLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // iki tamsayı alıp hem bu sayıları hem de aralarındaki sayıları yazdırın


        int baslangıc= 40;
        int bitis= 60;

        //forloop ile böyle yapabiliriz


        for (int i = baslangıc; i <=bitis ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println();

        //while loop la böyle yapılır
        int i=baslangıc;
        while (i<=bitis){

            System.out.print(i + " ");
            i++;
        }

    }
}
