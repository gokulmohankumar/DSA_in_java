package _12_Backtracking;
//https://leetcode.com/problems/permutations/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        findPermutations(nums,list,res);
        System.out.println(res);
    }
    public static void findPermutations(int[]nums,List<Integer>list,List<List<Integer>>res)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i]))
            {
                list.add(nums[i]);
                findPermutations(nums,list,res);
                list.removeLast();
            }
        }
    }
}
