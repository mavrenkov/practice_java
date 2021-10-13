package day_07;

public class Encapsulation {

    //1 Access modifiers

    // public:
    public static int  publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }


    // default:
    static int defaultVariable = 200;

    static void defaultMethod(){
        System.out.println("default method");
    }


    // private:
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }


    //encapsulation:

    private long ssn = 1234567;


    public long getSsn(){   // to read only
        return ssn;
    }

    public void setSsn(long ssn){
        this.ssn = ssn;
    }


    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        defaultMethod();
        privateMethod();

        Encapsulation encapsulation = new Encapsulation();
        //encapsulation.ssn;
        long ssn = encapsulation.getSsn();
        System.out.println(ssn);
        encapsulation.setSsn(1000000);
        ssn = encapsulation.getSsn();
        System.out.println(ssn);


    }
}
