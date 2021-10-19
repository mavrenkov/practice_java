package day_09.enums;
//enum article: https://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
public class Test {

    public static void main(String[] args) {

      //  String favoriteColor = "Pink";

        Color favoriteColor = Color.White;

        System.out.println(favoriteColor);

       // String browserName = "java";

      //  Browser browserName = Browser.opera;


        Browser browserName = Browser.chrome;

        switch (browserName){

            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");
                break;

            case safari:
                System.out.println("Safari browser is set");
                break;

            case edge:
                System.out.println("Edge browser is set");
                break;

        }

    }

}
