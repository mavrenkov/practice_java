package day_05;

import java.util.Arrays;

public class CustomMethods {

    public static void main(String[] args) {

        //1. void VS return
        helloWPrint();
        System.out.println(helloWString());
        System.out.println(Arrays.toString(helloWArray()));

    }

    public static void helloWPrint(){
        System.out.println("Hello world!");
    }
    public static String helloWString(){
        return "Hello world!";
    }
    public static String[] helloWArray(){
        return new String[]{"Hello", "world"};
    }

}
