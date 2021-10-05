package day_03;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

import java.util.zip.Deflater;

public class SwitchStatementQuiz {
    //4 questions about SWITCH statement, good luck!
    public static void main(String[] args) {
        //1
        /*
        long z = 10;
        switch (z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday ");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");

        }
         */
        /*
        What's the result?
        1. Monday
        2. Compile error
        3. Monday
           Tuesday
           Wednesday
           Friday
        4. Monday
           Tuesday
           Wednesday
         */
        //2
        /*
        double z =10;
        switch (z) {
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }
       */
        /*
        What's the output?
        1. Monday
           Tuesday
           Wednesday
           Friday
        2. Monday
        3. Compile error
        4. Monday
           Tuesday
           Wednesday
         */
        //3
        /*
        float z =10;
        switch (z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }
        */
        /*
        What's the output?
        1. Monday
                Tuesday
        Wednesday
                Friday
        2. Monday
        3. Compile error
        4. Monday
                Tuesday
        Wednesday
                */
        //4
        /*
        boolean option = true;                      //line 1
        switch (option){                            //line 2
            case true:                              //line 3
                System.out.println("True ");        //line 4
                break;                              //line 5
            default:                                //line 6
                System.out.println("False ");       //line 7
        }
           System.out.println("Complete");          //line 8
         */
        /*
        Which modification enables the code fragment to print: True Complete
        1. replace line 1 with String option=true; replace line 3 with the case "true";
        2. At line 5, remove the break statement
        3. Remove the default section
         */



    }

}
