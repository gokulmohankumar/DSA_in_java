package _7_Sorting;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class Cs_SetMismatch {
    public static void main(String[] args) {
        int[]arr={2,1,4,2,6,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
     int i=0;
     int n=nums.length;
     while(i<n)
     {
         int correctIndex=nums[i]-1;
         if(nums[i]!=nums[correctIndex])
         {
             int temp=nums[i];
             nums[i]=nums[correctIndex];
             nums[correctIndex]=temp;
         }
         else {
             i++;
         }
     }
     for(int j=0;j<n;j++)
     {
         if(nums[j]!=j+1)
         {
             return new int[]{nums[j],j+1};
         }
     }
     return new int[]{-1,-1};
    }
}

