package _10_Recursions;

import java.util.ArrayList;
import java.util.List;

public class DiceTarget {
    public static void main(String[] args) {
        int target=4;
        List<String>ans=findAllCombinations("",target);
        System.out.println(ans);
        System.out.println(ans.size());
    }
    public static List<String> findAllCombinations(String p,int target)
    {
        if(target==0)
        {
            List<String>l1=new ArrayList<>();
            l1.add(p);
            return l1;
        }
        List<String>ans=new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            ans.addAll(findAllCombinations(p+i,target-i));
        }
        return ans;
    }
}
