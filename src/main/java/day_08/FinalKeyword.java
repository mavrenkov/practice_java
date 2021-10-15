package day_08;

class Worker{
    public void working(){
       System.out.println("I am working");
    }
}

class SDET extends Worker{
    @Override
    public void working(){
        System.out.println("I am developing JAVA automation framework");
    }
}


public class FinalKeyword {

    public static void main(String[] args) {

        String str = "Hello world!";
        str = str.concat(" Today is Friday! Yay!");
        System.out.println(str);

    }

}
