package day_07.Phone;

public class Phone {
    public String model;
    public double price;
    public int size;
    static String brand;
    static String operatingSystem;
    static String madeIn;

    public void setInfo(String model, double price, int size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void Call(){
        System.out.println("Calling on "+ brand+" "+model);
    }
    public void Text(){
        System.out.println("Texting to "+ brand+" "+model);
    }
    public void Selfie(){
        System.out.println("Taking selfie on "+ brand+" "+model);
    }
    public String toString(){
        return "Brand: "+brand+ ", model: "+model+", It's costs: "+ price+"$, Size is: "+size+", made in: "+madeIn+ ", operating system: "+operatingSystem;
    }
}
