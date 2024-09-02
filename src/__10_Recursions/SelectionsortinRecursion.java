package __10_Recursions;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionsortinRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
       selectionSort(arr,n,0,0);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[]arr,int r, int c,int max)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[max])
            {
                selectionSort(arr,r,c+1,c);
            }
            else{
                selectionSort(arr,r,c+1,max);
            }
        }
        else {
            swap(arr,max,r-1);
            selectionSort(arr,r-1,0,0);
        }
    }

    public static void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
