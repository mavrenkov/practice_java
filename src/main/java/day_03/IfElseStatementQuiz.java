package day_03;

public class IfElseStatementQuiz {

    //10 questions about IF ELSE statement, good luck!
    // || - means OR, && means AND in Java
    public static void main(String[] args) {

        //1
        /*
        int num = 9;

        if(num++ ==10){ //line 1
            System.out.println("Hello world "+ num); //line 2
        }else{
            System.out.println("Hello Universe! "+ num); //line 3
        }

         */

        /*
        What's the output?
        1. Hello Universe 10
        2. Hello World 9
        3. Compile error at line 1
        4. Compile error at line 2
        5. Compile error at line 3
         */

        //2
        /*
        int score =0;
        if(score ==0){
            score+=50;
        }
        if(score!=0){
            score +=50;
        }
        System.out.println(score);

         */
        /*
        What's the output?
        1. Compilation fails
        2. 50
        3. 100
        4. 0
         */

        //3
        /*
        char grade = 'A';
        boolean passed = grade=='A' || grade == 'B';
        boolean passed2 = grade=='C' || grade == 'D';

        if(passed || passed2){
            System.out.println("You passed the test!");
        }else{
            System.out.println("You failed");
        }

         */

        /*
        1. Compile error
        2. Empty output
        3. You failed
        4. You've passed the exam
         */

        //4
        /*
        boolean A = true, B = !false;

        if(B){
            System.out.println("B");
        }else if(A){
            System.out.println("A");
        }else{
            System.out.println("C");
        }

         */

        /*
        What's the result?
        1. A
        2. B
        3. Compile error
        4. C
         */

        //5
        /*
        boolean result =true;
        if(result){
            System.out.println("it's true!");
        }else{
            System.out.println("its false!");
        }else if(result){
            System.out.println("None of the above");
        }
         */
        /*
        What's the result?
        1. Its true
        2. None of the above
        3. Compile error
        4. it's false
         */

        //6

        /*
        In multi-branch if statement we can give as many "else-if" statements as we want
        1. true
        2. false
         */

        //7

        /*
        when we declare  if statement, it is mandatory to give the else block
        1. true
        2. false
         */

        //8
        /*
        int number= 10;
        if (--number>10){
            System.out.println("Hello world "+number);
        }else if(number==9){
            System.out.println("Hello universe "+number);
        }
         */
        /*
        What's the output?
        1. Hello world 10
        2. None of the above
        3. Hello universe 10
        4. compile error
        5. Hello world 9
         */

        //9
        /*
        boolean X = true;
        boolean Y = !X==false;
        boolean Z =  Y;

        if(X){
            System.out.println("Hello everyone!");
        }
        if(Y){
            System.out.println("today is a great day");
        }
        if(Z){
            System.out.println("I love Java, I will make everyone love it!");
        }

         */
        /*
        What's the output?
        1. Hello everyone!
           today is a great day
           I love Java, I will make everyone love it!
        2. today is a great day
           I love Java, I will make everyone love it!
        3. today is a great day
        4. Hello everyone!
           today is a great day
        5. Hello everyone!
        6. I love Java, I will make everyone love it!
        7. Hello everyone!
           I love Java, I will make everyone love it!
         */

        //10
        /*
        int x =10;
        int y = x++;
        System.out.println(y++ + " " + x++ + " " + y);

         */
        /*
        What will be the result?
        1. 11 12 11
        2. 12 12 12
        3. 10 10 11
        4. 10 11 11
         */






    }



}
