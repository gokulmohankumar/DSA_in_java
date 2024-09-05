package _10_Recursions;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Is is sorted : "+sorted(arr,0));
    }
    static boolean sorted(int[]arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1]&&sorted(arr,index+1);
    }
}
