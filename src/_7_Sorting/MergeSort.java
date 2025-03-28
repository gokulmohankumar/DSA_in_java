package _7_Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
             int[]arr={3,5,1,8,10,2,7,9,4,6};
             mergeSort(arr,0,9);
             System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[]arr,int low,int high)
    {
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[]arr,int low,int mid, int high)
    {
        int[]temp=new int[high-low+1];
        int l=low;
        int r=mid+1;
        int ind=0;
        while(l<=mid && r<=high)
        {
            if(arr[l]<=arr[r])
            {
                temp[ind++]=arr[l];
                l++;
            }else {
                temp[ind++]=arr[r];
                r++;
            }
        }
        while(l<=mid){
            temp[ind++]=arr[l];
            l++;
        }
        while (r<=high)
        {
            temp[ind++]=arr[r];
            r++;
        }
        for (int i = low; i <=high; i++) {
            arr[i]=temp[i-low];
        }
//        System.arraycopy(temp,0,arr,low,temp.length);
    }
}
