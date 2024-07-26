package _3_Arrays;

import java.util.Scanner;

public class SubarrayOfArray {
    //sub array is a continous part of an array

    private static void Subarray(int[] arr, int start, int end) {

        for(int i=start;i<=end;i++)
        {
            for (int j = i; j <=end ; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the range to print all the subarrays of given range ex(0 3)");
        int start=in.nextInt();
        int end= in.nextInt();
        System.out.println("Sub arrays of the given range "+start+" to "+end);
        Subarray(arr,start,end);
    }
}
