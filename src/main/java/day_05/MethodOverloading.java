package day_05;

public class MethodOverloading {

    public static void main(String[] args) {



    }

    public static void overloadedMethod(int argument){
        System.out.println("I am the integer! "+ argument);
    }
    public static void overloadedMethod(double argument){
        System.out.println("I am the double! "+ argument);
    }
    public static void overloadedMethod(char argument){
        System.out.println("I am the char! "+ argument);
    }
    public static void overloadedMethod(int argumentOne, int argumentTwo){
        System.out.println("I am the two integers! "+ argumentOne + " and "+ argumentTwo);
    }

}
