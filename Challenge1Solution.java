
 // Write a Java program to trim any leading or trailing whitespace from a given string
 
public class Challenge1Solution {

    public static void main(String[] args) {

        //creating a initial string with three leading and trailing white spaces
        String initialString = "   This is a String   ";

        //Removing whitespaces using String trim method and assigning it to a new string
        String modifiedString = initialString.trim();

        System.out.println("Initial String: " + initialString);
        System.out.println("Modified String: " + modifiedString);
    }
}
