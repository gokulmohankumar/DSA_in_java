package _11_Recursion_II_inStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class SubseqReturning {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to print all its substrings");
        String str=in.next();
        System.out.println(printSubsequence(str,""));
    }
    public static ArrayList<String> printSubsequence(String str, String res)
    {
        ArrayList<String>inlist=new ArrayList<>();
        if(str.isEmpty())
        {
            if(!res.isEmpty()) {
                inlist.add(res);
            }
            return inlist;
        }
        char ch=str.charAt(0);
        ArrayList<String>left= printSubsequence(str.substring(1),res);
        ArrayList<String>right= printSubsequence(str.substring(1),res+ch);
        left.addAll(right);
        return left;
    }
}
