package day_08.shapes;

public abstract class Shape { //cannot create object, cannot be final

    public String name;
    public boolean hasVolume;
    public double area;
    public double perimeter;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();
}
