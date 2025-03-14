package _10_Recursions;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str="malayalam";
        int n=str.length();
        boolean isPalindrome=checkPalindrome(0,n,str);
        System.out.println(isPalindrome);
    }
    public static boolean checkPalindrome(int i,int n,String str)
    {
        if(i>=n/2)
        {
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1))
        {
            return false;
        }
        return checkPalindrome(i+1,n,str);
    }
}
