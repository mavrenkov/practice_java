package day_02;

public class StringMethods {

    public static void main(String[] args) {

        //String objects are immutable, meaning that String methods do not change the String object.
        //Any method that seems to change a string actually creates a new string.

        //A String object has index values from 0 to length – 1.
        //Attempting to access indices outside this range will result in an IndexOutOfBoundsException.

        String example = "Java";

        //1. charAt() - returns Returns the character at the specified index (position)

        System.out.println("example.charAt(0) = " + example.charAt(0));

        //2. contains() - Checks whether a string contains a sequence of characters (boolean - true/false)

        System.out.println("example.contains(\"av\") = " + example.contains("av"));

        //3. endsWith() & startsWith() - Checks whether a string ends with the specified character (boolean - true/false)

        System.out.println("example.endsWith(\"a\") = " + example.endsWith("a"));
        System.out.println("example.startsWith(\"J\") = " + example.startsWith("J"));

        //4. equals() Compares two strings. Returns true if the strings are equal, and false if not.
        //   equalsIgnoreCase()	Compares two strings, ignoring case considerations

        System.out.println("example.equals(\"Java\") = " + example.equals("Java"));
        System.out.println("example.equalsIgnoreCase(\"jAVA\") = " + example.equalsIgnoreCase("jAVA"));

        //5. format()	Returns a formatted string using the specified locale, format string, and arguments
        String exampleToFormat = "I love %s";
        System.out.println(String.format(exampleToFormat, "Java"));

        //another way is to use printf (please note - it doesn't have a line break)
        System.out.printf((exampleToFormat) , "Java");
        System.out.println(); //line break

        //you can also use multiple %s
        String exampleToFormat2 = "I love %s and I will %s %s %s";
        System.out.println(String.format(exampleToFormat2, "Java", "be", "Java", "Expert"));

        //6. indexOf()	Returns the position of the first found occurrence of specified characters in a string

        System.out.println("example.indexOf(\"a\") = " + example.indexOf("a"));

        //7. length()	Returns the length of a specified string

        System.out.println("example.length() = " + example.length());

        //8.replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced
        //  replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement

        System.out.println("example.replace(\"a\", \"A\") = " + example.replace("a", "A"));
        System.out.println("example.replaceFirst(\"a\", \"A\") = " + example.replaceFirst("a", "A"));

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("Java" , "C#");
        System.out.println("sentence = " + sentence);

        //9.split()	Splits a string into an array of substrings

        String[] arr = example.split("");

        //10. substring()	Returns a new string which is the substring of a specified string

        System.out.println("example.substring(0,1) = " + example.substring(0, 2));

        //Remember that substring(from,to) does not include the character at the to index!
        //To return a single character at index i, use str.substring(index, index + 1).

        //11. toCharArray()	Converts this string to a new character array	char[]

        char [] arr2 = example.toCharArray();

        //12. trim()	Removes whitespace from both ends of a string

        String exampleToTrim = "                I have extra spaces                       ";
        System.out.println("exampleToTrim = " + exampleToTrim);
        System.out.println("exampleToTrim.trim() = " + exampleToTrim.trim());

        //13.valueOf()	Returns the string representation of the specified value

        System.out.println("String.valueOf(12.5) = " + String.valueOf(12.5));


        String a = "str"; //String poll
        String b = new String("str"); //heap
        //new keyword will create a new String object. Without it, we will refer to the same String
        System.out.println("a==b = " + a == b); // false - because its 2 different objects
        System.out.println("a.equals(b) = " + a.equals(b)); // true - because it has the same characters in the same order.

    }


}




