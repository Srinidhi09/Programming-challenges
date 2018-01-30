import java.util.Scanner;

class Challenge2Solution{
    public static boolean checkUniqueChar( String s) {
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++)
                //checking if character at index i matches with any character at index j
                if (s.charAt(i) == s.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any unique String :");
        String newString = sc.nextLine();
        if (checkUniqueChar(newString)){
            System.out.println("The String " +newString+ " has all unique values");
        }
        else {
            System.out.println("Oops, the String " +newString+ " has duplicate values!");
        }
        return;
    }
}