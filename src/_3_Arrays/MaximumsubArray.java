package _3_Arrays;

import java.util.Scanner;

public class MaximumsubArray {
    //sliding window technique
    public static int maxSubArray(int[]arr,int n,int k)
    {
       int wsum=0;
       int msum=Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            wsum+=arr[i];
        }
        for (int i = k; i < n; i++) {
           wsum = wsum - arr[i-k]+arr[i];
           if(wsum>msum)
           {
               msum=wsum;
           }
        }
        return msum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get inputs
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[]arr=new int[n];
        System.out.println("ennter the elements of the array");
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the size of the sub array to be maximum");
        int k =in.nextInt();

        //call the function
        System.out.println("Maximum sum of the "+k+" sub array is : "+maxSubArray(arr,n,k));
    }
}
