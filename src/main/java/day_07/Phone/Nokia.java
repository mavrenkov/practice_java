package day_07.Phone;

public class Nokia extends Phone{
    static{
        brand ="Nokia";
        madeIn = "Finland";
        operatingSystem = "Windows Mobile";
    }
    public Nokia(String model, double price, int size) {
        super.setInfo(model, price, size);
    }

    public void breakTheFloor(){
        System.out.println("Oops, you dropped your "+brand+" "+model+" on the floor. Now you have a tunnel in your house - floor is broken. ");
    }

}
