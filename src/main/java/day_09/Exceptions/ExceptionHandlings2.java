package day_09.Exceptions;

public class ExceptionHandlings2 {


    public static void main(String[] args) {

        String exceptionResult = "";

        try {

            System.out.println(10 / 0); // exception

        }catch(ArithmeticException e){
            exceptionResult =  e.getMessage();
            System.out.println("ArithmeticException is detected");
        }

        System.out.println(exceptionResult);



    }

}
