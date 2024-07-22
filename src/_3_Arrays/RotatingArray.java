package _3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotatingArray {
    private static void arrayRotation(int[] arr,int n,int k)
    {
        if(k<0) k=k+n;
        else   k=k%n;
        reversArray(arr,0,k-1); //part 1
        reversArray(arr,k,n-1);  //part 2
        reversArray(arr,0,n-1); // whole array
    }
    private static void reversArray(int[]arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[]array=new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i <n ; i++) {
            array[i]=in.nextInt();
        }
        System.out.println("Enter the how many times to rotate 'mention + for left, - for right '");
        int k=in.nextInt();
        System.out.println("Before rotating");
        System.out.println(Arrays.toString(array));
        /* calling the function */
        arrayRotation(array,n,k);
        System.out.println("After Rotating "+k+" time");
        System.out.println(Arrays.toString(array));
    }
}
