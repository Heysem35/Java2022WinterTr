package Practice;

public class ForLoop_soru7 {
    public static void main(String[] args) {

        String str= "java";
        String tersstr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersstr+=str.charAt(i);



        }
        System.out.println(tersstr);

    }
}
