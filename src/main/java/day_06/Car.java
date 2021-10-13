package day_06;

public class Car {

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public Car(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    }


    public void getCarInfo() {
        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + ", $" + price);
    }

    public void start() {
        System.out.println(brand + " " + model + " is started");
    }

}