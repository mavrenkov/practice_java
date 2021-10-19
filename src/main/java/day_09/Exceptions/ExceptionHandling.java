package day_09.Exceptions;

import java.util.ArrayList;
// https://rollbar.com/blog/java-exceptions-hierarchy-explained/
public class ExceptionHandling {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // empty

        String exceptionMessage = "";

    try {

        System.out.println(list.get(2));

    }catch (IndexOutOfBoundsException e){
            exceptionMessage =  e.getMessage() ;
    }


        System.out.println(exceptionMessage);




    }

}
