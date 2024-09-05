package _10_Recursions;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortinrecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        bubbleSort(arr,n-1,0);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int[]arr,int i,int j)
    {
        if(i==0)
        {
            return ;
        }
        if(j<i)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr,j,j+1);
            }
                bubbleSort(arr,i,j+1);
        }
        else {
            bubbleSort(arr,i-1,0);
        }
    }
    public static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
