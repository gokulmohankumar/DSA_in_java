package _11_Recursion_II_inStrings;
import java.util.ArrayList;
import java.util.Scanner;

public class ReturnAllPermutations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the the string to find its permutation");
        String str=in.next();
        ArrayList<String>ans=returnPermutations(str,"");
        System.out.println( ans);
        System.out.println("Number of permutation = "+ans.size());
    }
    public static ArrayList<String> returnPermutations(String str,String res)
    {
        if(str.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(res);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for (int i = 0; i <=res.length(); i++) {
            String f=res.substring(0,i);
            String s=res.substring(i);
            ans.addAll(returnPermutations(str.substring(1),f+ch+s));
        }
        return ans;
    }
}
