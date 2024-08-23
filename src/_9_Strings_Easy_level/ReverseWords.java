package _9_Strings_Easy_level;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence to reverse words in that.");
        String str=in.nextLine();
        String []arr=str.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
