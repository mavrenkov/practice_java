package day_05;

public class WrapperClasses {

    public static void main(String[] args) {

        int num = 1;
        Integer numWrapped = 2;
        numWrapped = num; // autoboxing

        Integer x = 25;
        int x2 = x;     //unboxing

        double d = 10.5;
        // x=d;     //wrapper class is only dedicated to its primitive

        //Wrapper class methods
        //1. Parse
        String str = "true";
        boolean b1 = Boolean.parseBoolean(str);
        String str2 = "100.1";
        double d2 = Double.valueOf(str2); // unboxing

        //2. MAX_VALUE, MIN_VALUE
        System.out.println(Integer.MAX_VALUE);

    }


}
