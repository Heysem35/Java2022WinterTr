package Practice;

import java.util.Scanner;

public class stringManipulation_soru2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("cümle: ");
        String cumle= scan.nextLine();
        System.out.print("kelime: ");
        String kelime= scan.nextLine();

        int kelimeindex= cumle.indexOf(kelime); //4
        System.out.println(kelimeindex);

        int kelimetekrar= cumle.indexOf(kelime, kelimeindex+1); //22
        System.out.println(kelimetekrar);



        if (kelimeindex==-1){
            System.out.println("kelime cumlede kullanılmamıs");

        }else if (kelimetekrar<0){
            System.out.println("kelime bir kere kullanılmıs");

        }else {
            System.out.println("kelime birden fazla kullanılmıs");
        }
    }
}
