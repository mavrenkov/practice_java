package day_07;

public class Circle {

    double radius;
    double diameter;
    static double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea(){
        return radius * radius* pi;
    }

    public double calcPerimeter(){
        return diameter*pi;
    }


    public String toString(){

        return "Radius: "+radius+"\nDiameter: "+diameter+"\n PI: "+pi+"\nArea: "+calcArea()+"\nPerimeter: "+calcPerimeter();
    }

}