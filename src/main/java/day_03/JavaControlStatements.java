package day_03;

public class JavaControlStatements {

    public static void main(String[] args) {
        // Simple if statement

//        if(true){
//            System.out.println("I love Java");
//        }

        // if-else statement

//        int x = 10;
//        int y = 12;
//        if(x+y < 10) {
//            System.out.println("x + y is less than 10");
//        }   else {
//            System.out.println("x + y is greater than 20");
//        }

        //if-else-if ladder

//        String city = "Cologne";
//        if(city == "Berlin") {
//            System.out.println("city is: Berlin");
//        }else if (city == "Cologne") {
//            System.out.println("city is: Cologne");
//        }else if(city == "Munich") {
//            System.out.println("city is: Munich");
//        }else {
//            System.out.println(city);
//        }

        //switch statement:

        /*
        The case variables can be int, short, byte, char, or enumeration. String type is also supported since version 7 of Java
        Cases cannot be duplicate
        Default statement is executed when any of the case doesn't match the value of expression. It is optional.
        Break statement terminates the switch block when the condition is satisfied.
        It is optional, if not used, next case is executed.
        While using switch statements, we must notice that the case expression will be of the same type as the variable. However, it will also be a constant value.
         */

//        int num = 2;
//        switch (num) {
//            case 0:
//                System.out.println("number is 0");
//                break;
//            case 1:
//                System.out.println("number is 1");
//                break;
//            default:
//                System.out.println(num);
//        }

        //Loop statements

        /*
        for loop
        while loop
        do-while loop
         */
        //1. for loop
        // for(initialization, condition, increment/decrement) {
        //block of statements
        //}

//        int sum = 0;
//        for(int j = 1; j<=10; j++) {
//            sum = sum + j;
//        }

        //2. for-each loop
       // for(data_type var : array_name/collection_name){
            //statements
       // }

//        String[] names = {"Java","C","C++","Python","JavaScript"};
//        System.out.println("Printing the content of the array names:\n");
//        for(String name:names) {
//            System.out.println(name);
//        }

        //3. While loop
        /*
        while(condition){
            //looping statements
            }
         */

//        int i = 0;
//        System.out.println("Printing the list of first 10 even numbers \n");
//        while(i<=10) {
//            System.out.println(i);
//            i = i + 2;
//        }

        //4. Do-while loop
        /*
        do
            {
                //statements
            } while (condition);
         */

//        int i = 0;
//        System.out.println("Printing the list of first 10 even numbers \n");
//        do {
//            System.out.println(i);
//            i = i + 2;
//        }while(i<=10);

        //Jump statements
        //1. break

//        for(int i = 0; i<= 10; i++) {
//            System.out.println(i);
//            if(i==6) {
//                break;
//            }
//        }

        //2. continue
//        for(int i = 0; i<= 10; i++) {
//            System.out.println(i);
//            if(i==6) {
//                continue;
//            }
//        }


    }

}



