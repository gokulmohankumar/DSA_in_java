package _12_Backtracking;
//https://leetcode.com/problems/combinations/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        findCombinations(1,n,k,list,res);
        System.out.println(res);
    }
   public static void findCombinations(int start,int n,int k,List<Integer>list,List<List<Integer>>res)
   {
       if(list.size()==k)
       {
           res.add(new ArrayList<>(list));
           return;
       }
       for(int i=start;i<=n;i++)
       {
           if(!list.contains(i))
           {
               list.add(i);
               findCombinations(i+1,n,k,list,res);
               list.removeLast();
           }
       }
   }
}
