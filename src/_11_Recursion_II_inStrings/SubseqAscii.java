package _11_Recursion_II_inStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class SubseqAscii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to print all its substrings");
        String str=in.next();
        System.out.println(printSubsequence(str,""));
    }
    public static ArrayList<String> printSubsequence(String str, String res)
    {
        if(str.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            if(!res.isEmpty())
              list.add(res);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String>first= printSubsequence(str.substring(1),res);
        ArrayList<String>second= printSubsequence(str.substring(1),res+ch);
        ArrayList<String>third= printSubsequence(str.substring(1),res+(ch+0));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

