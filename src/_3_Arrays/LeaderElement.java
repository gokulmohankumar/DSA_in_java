package _3_Arrays;

import java.util.Scanner;

//An leader element is the rightmost element which is greater than all the elements to the rightside
//time complexity O(n)
public class LeaderElement {
    private static int findLeader(int[] arr, int n) {
        int c=0;
        int maxCount=0;
        int lead=arr[0];
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1])
            {
                c++;
                if(c>maxCount)
                {
                    maxCount=c;
                    lead=arr[i-maxCount+1];
                }
            }
            else {
                c=0;
            }
        }
        return lead;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the arrray");
        for (int i = 0; i < n; i++) {
                     arr[i] = in.nextInt();
        }
        System.out.println("the leader element is : "+ findLeader(arr,n));
    }

}
