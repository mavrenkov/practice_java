package day_07;

import day_06.Car;

public class StaticBlock {

    static int a;
    static String b ;
    static Car car1;
    static Car car2;

    static {

        a = 100;
        b = "String";

        car1 = new Car("BMW", "X5", 2021, "black", 6000, 55000);
        car2 = new Car("Audi", "Q7", 2022, "white", 1000, 75000);

    }


}
