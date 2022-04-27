package Practice;

import java.util.Arrays;

public class Array_cidi {


    public static void main(String[] args) {

        //string arrayde tekrar eden char karakterleri döndüren bir kod yazın

        String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        Arrays.sort(arr);
        int count;

        //Converts given string into character array
        char string[] = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                System.out.print(string[i]);
        }


    }
}
