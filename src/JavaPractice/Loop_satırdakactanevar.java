package JavaPractice;

public class Loop_satırdakactanevar {
    public static void main(String[] args) {

        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        String str = "aabbcccccddddaaa";

        birKereYazdir("aabbcccccddddaaa");
    }

        private static void birKereYazdir (String str){
            String sonuc = "";
            for (int i = 0; i <= str.length() - 1; i++) {  //int i=0;i<str.length();i++  bu sekilde de oluyor
                if (!sonuc.contains(str.substring(i, i + 1))) {
                    sonuc += str.substring(i, i + 1);
                }
            }
            System.out.println(sonuc);
        }


}


