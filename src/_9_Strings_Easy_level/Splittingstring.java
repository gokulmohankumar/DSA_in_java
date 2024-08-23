package _9_Strings_Easy_level;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

//Splitting string in 3 methods
//1. String class split method
//2. Pattern.compile(regex).splitAsStream(String)
//3. String tokenizer

public class Splittingstring {
    public static void main(String[] args) {

        //method1
        String s1="091-1234325-23343";
        System.out.println("Original string : "+s1);
        String []str1=s1.split("-");
        System.out.println("Using: String class split method");
        for(String s:str1)
        {
            System.out.print(s+" | ");
        }
        System.out.println("\n");

        //method 2
        String s2="123_Gokul_777";
        System.out.println("Original string : "+s2);
        List<String> strl= Pattern.compile("_").splitAsStream(s2).toList();
        System.out.println("Using: Pattern.compile(regex).splitAsStream(String)");
        for(String s:strl)
        {
            System.out.print(s+" | ");
        }
        System.out.println("\n");

        //method3
        String s3="Hello how are you all";
        System.out.println("Original string : "+s3);
        StringTokenizer strT=new StringTokenizer(s3," ");
        System.out.println("Using : String tokenizer");
        while(strT.hasMoreTokens())
        {
            String token= strT.nextToken();
            System.out.print(token+" | ");
        }
        System.out.println();
    }

}
