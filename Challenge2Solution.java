/**
 * Implement an algorithm to determine if a string has all unique characters or not
 */

import java.util.*;

public class Challenge2Solution{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :");
        String str = sc.nextLine();
        string uc = new string();
        boolean result = uc.checkUnique(str);
        if(result)
            System.out.println("String has all unique characters");
        else
            System.out.println("String does not have all unique characters");
    }

    public boolean checkUnique(String str){

        HashSet hashSet = new HashSet(str.length());

        for(char c : str.toCharArray()){ //iterate through character array
            if(!hashSet.add(Character.toUpperCase(c)))//try to add each char to hashset
                return false; //return false if could not add
        }
        return true;
    }
}