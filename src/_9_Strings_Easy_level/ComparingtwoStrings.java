package _9_Strings_Easy_level;

//Comparing two strings without using builtin function

import java.util.Scanner;

public class ComparingtwoStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings seperated by space two check it is equal ignoring case");
        String s1=in.next();
        String s2=in.next();
        boolean isEquals=checkEqual(s1,s2);
        System.out.println("Is it equal? : "+isEquals);
    }
    public static boolean checkEqual(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
}
