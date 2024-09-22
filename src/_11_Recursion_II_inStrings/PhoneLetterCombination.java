package _11_Recursion_II_inStrings;
//question Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombination {
    public static void main(String[] args) {
        String str="23";
        System.out.println(findComb(str));
    }
    public static List<String> findComb(String str)
    {
        List<String>ans=new ArrayList<>();
        helperCall(str,"",ans);
        return ans;
    }
    public static void helperCall(String str,String res,List<String>ans)
    {
        if(str.isEmpty())
        {
            ans.add(res);
            return;
        }
        int digit=str.charAt(0)-'0';
        int start=0;
        int end=0;
        if(digit==7)
        {
            start=15;
            end=19;
        } else if (digit==8) {
            start=19;
            end=22;
        } else if (digit==9) {
            start=22;
            end=26;
        }
        else {
            start=(digit-2)*3;
            end=(digit-1)*3;
        }
        for (int i = start; i < end; i++) {
            char ch=(char)(i+'a');
            helperCall(str.substring(1),res+ch,ans);
        }
    }
}
