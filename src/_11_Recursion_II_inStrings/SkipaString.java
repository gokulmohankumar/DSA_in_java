package _11_Recursion_II_inStrings;

import java.util.Scanner;

public class SkipaString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.nextLine();
        System.out.println("Enter a string to remove from that ");
        String rstr=in.next();
        System.out.println(removeString(str,rstr));
    }
    public static String removeString(String str,String rstr)
    {
        if(str.isEmpty())
        {
            return "";
        }
        if(!str.startsWith(rstr))
        {
            return str.charAt(0)+removeString(str.substring(1),rstr);
        }
        return removeString(str.substring(rstr.length()),rstr);
    }
}
