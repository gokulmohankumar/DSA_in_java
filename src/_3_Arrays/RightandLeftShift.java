package _3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightandLeftShift {

    private static void rightShift(int[] arr, int n) {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    private static void leftShift(int[] arr, int n) {
        int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
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
        System.out.println("Before Shifting \n"+Arrays.toString(array));
        rightShift(array,n);
        System.out.println("Right Shifting \n"+Arrays.toString(array));
        leftShift(array,n);
        System.out.println("Left Shifting \n"+Arrays.toString(array));
    }

}
//Note: Call the function one by one after executing
// because leftShift will make normal the rightShift and vice versa so the array becomes unchanged.
