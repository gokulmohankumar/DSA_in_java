package DynamicProgramming;

import java.util.Arrays;

public class Frogjump_K_steps {
    public static void main(String[] args) {
        int[]heights={10,30,40,50,20};
        int k=3;
        int ind=heights.length-1;
        System.out.println(frogK(heights,k,ind)+" Recursion");
        int[]dp=new int[heights.length+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(frogKMemoization(heights,k,ind,dp)+" Memoization");
        System.out.println(frogKTabulation(heights,k,ind)+" Tabulation");
    }
    public static int frogK(int[]heights,int k,int ind)
    {
         if(ind==0) return 0;
         int mmsteps=Integer.MAX_VALUE;
         for (int j = 1; j <=k; j++) {
            if(ind-j>=0)
            {
                int jump=frogK(heights,k,ind-j)+Math.abs(heights[ind]-heights[ind-j]);
                mmsteps=Math.min(jump,mmsteps);
            }
         }
        return mmsteps;
    }
    public static int frogKMemoization(int[]heights,int k,int ind,int[]dp)
    {
        if(ind==0)return 0;
        else if (dp[ind]!=-1) {
            return dp[ind];
        }
        int min=Integer.MAX_VALUE;
        for (int j = 1; j <=k; j++) {
            if(ind-j>=0)
            {
                int jump=frogKMemoization(heights,k,ind-j,dp)+Math.abs(heights[ind]-heights[ind-j]);
                min=Math.min(min,jump);
            }
        }
        return dp[ind]=min;
    }
    public static int frogKTabulation(int[]heights,int k,int ind)
    {
        int[]dp=new int[heights.length];
        dp[0]=0;
        for (int i = 1; i <=ind; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 1; j <=k; j++) {
                if(i-j>=0)
                {
                    int jump=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                    min=Math.min(jump,min);
                }
                dp[i]=min;
            }
        }
        return dp[ind];
    }
}
