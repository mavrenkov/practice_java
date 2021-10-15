package day_08.PhoneTasks;

public class Iphone extends Phone implements AppleApp{


    public Iphone( String model, String size, double price) {
        super("Iphone", model, size, price);
        if(price > 1500){
            throw new RuntimeException("Iphone price cannot be greater than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading app from "+AppStoreName);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $ " + price +
                '}';
    }



}
