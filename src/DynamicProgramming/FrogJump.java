package DynamicProgramming;
//https://www.naukri.com/code360/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTabValue=PROBLEM
import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int []heights={10,20,30,10,20};
        int n=5;
        System.out.println(frogJumpRecursion(n-1,heights)+" Recursion");
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(frogJumpMemoization(n-1,heights,dp)+" Memoization");
        System.out.println(frogJumpTabulation(n,heights)+" Tabulization");
        System.out.println(frogJumpOptimized(n-1,heights)+" Space optimized");
    }
    private static int frogJumpRecursion(int n, int[] heights) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return Math.abs(heights[1]-heights[0]);
        }
        int left=frogJumpRecursion(n-1,heights)+Math.abs(heights[n]-heights[n-1]);
        int right=frogJumpRecursion(n-2,heights)+Math.abs(heights[n]-heights[n-2]);
        return Math.min(left,right);
    }
    public static int frogJumpMemoization(int n,int[]heights,int[]dp)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return Math.abs(heights[1]-heights[0]);
        }
        else if(dp[n]!=-1)return dp[n];
        else
        {
            int left=frogJumpMemoization(n-1,heights,dp)+Math.abs(heights[n]-heights[n-1]);
            int right=frogJumpMemoization(n-2,heights,dp)+Math.abs(heights[n]-heights[n-2]);
            return Math.min(left,right);
        }
    }
    public static int frogJumpTabulation(int n,int[]heights)
    {
        int[]dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            int left=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1)
            {
                right=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]=Math.min(left,right);
        }
        return dp[n-1];
    }
    public static int frogJumpOptimized(int n,int[]heights)
    {
        int prev2=0;
        int prev1=Math.abs(heights[1]-heights[0]);
        for (int i = 2; i <=n; i++) {
            int fs=Math.abs(heights[i]-heights[i-1])+prev1;
            int ss=Math.abs(heights[i]-heights[i-2])+prev2;
            int curr=Math.min(fs,ss);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
