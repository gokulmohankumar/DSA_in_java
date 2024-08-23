package _9_Strings_Easy_level;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to check whether it is palindrome or not");
        String s1=in.next();
        String s2="";
        for(int i = s1.length()-1; i>=0; i--)
        {
            s2 = s2 + (s1.charAt(i));
        }
        if(s1.compareTo(s2) == 0)
            System.out.println("given String is Palindrome!");
        else System.out.println("Not a palindrome");
    }
}
//        In our code, every time we concatenate s2 = s2 + (s1.charAt(i));
//        a new String object is created. This is because String objects in Java are immutable,
//        meaning that their values cannot be changed after they are created. As a result, each
//        concatenation creates a new String object, which can be inefficient, especially for
//        longer strings.
//
//        Optimized Approach:
//        You can optimize this by using a StringBuilder instead of a String for the reverse operation.
//        StringBuilder is mutable, so it can append characters to the existing object without creating new ones,
//        which is more efficient.
//        StringBuilder s2;
//        in loop : s2.append(s1.charAt(i)), already we done in _2_RegularProblems/PalindromeString.