package _9_Strings_Easy_level;

import java.util.Scanner;

public class EvenLengthWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a sentence to print all the even words");
        String str=in.nextLine();
        boolean evenOccured=false;
        for(String s:str.split(" "))
        {
            if(s.length()%2==0)
            {
             evenOccured=true;
                System.out.println(s);
            }
        }
      if(!evenOccured)
      {
          System.out.println("No words are even in length");
      }
    }
}
