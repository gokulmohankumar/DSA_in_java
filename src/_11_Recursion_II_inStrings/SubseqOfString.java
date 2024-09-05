package _11_Recursion_II_inStrings;

import java.util.Scanner;

public class SubseqOfString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string to print all its substrings");
        String str=in.next();
        printSubsequence(str,"");
    }
    public static void printSubsequence(String str, String res)
    {
           if(str.isEmpty())
           {
                System.out.println(res);
                return;
           }
           char ch=str.charAt(0);
           printSubsequence(str.substring(1),res);
           printSubsequence(str.substring(1),res+ch);
    }
}
