package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda01_Practice {

    public static void main(String[] args) {


        List<String> str= new ArrayList<>(Arrays.asList("Can", "Ali", "Veli"));

        stryazdir(str);
        stryazdirfunctional(str);
    }

    private static void stryazdirfunctional(List<String> str) {
        str.stream().forEach((Consumer<? super String>) t-> System.out.print(t +" "));
    }


    private static void stryazdir(List<String> str) {
        System.out.println(str);
    }



}
