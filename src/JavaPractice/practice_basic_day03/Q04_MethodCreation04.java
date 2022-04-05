package JavaPractice.practice_basic_day03;

public class Q04_MethodCreation04{
    public static void main(String[] args) {


        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */


		/*

		Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */

    String str= "a31bc3de4";
    String rakamlar= "";
    int rakamlarToplami=0;




        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){ rakamlar+=str.substring(i,i+1);}

        }

        System.out.println("değişkendeki rakamlar= "+rakamlar);

        for (int i = 0; i < rakamlar.length(); i++) { rakamlarToplami+= Integer.parseInt(rakamlar.substring(i,i+1));

        }
        System.out.println("rakamların toplamı:" + rakamlarToplami);


    }
        }











