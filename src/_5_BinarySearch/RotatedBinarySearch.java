package _5_BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={6,7,1,2,3,4,5};
        int target=6;
        int pivot=findPivot(arr);
        int ans;
        System.out.println(pivot);
        if(pivot==-1){
            ans= binarySearch(arr,target,0,arr.length-1);
        }
        else if(arr[pivot]==target)
        {
            ans= pivot;
        }
        else if(target>=arr[0])
        {
            ans= binarySearch(arr,target,0,pivot-1);
        }
        else {
            ans=binarySearch(arr,target,pivot+1,arr.length-1);
        }
        System.out.println(ans);
    }
    //this pivot method will not work for duplicate values
    static int findPivot(int[]arr)
    {
        int start =0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) // to ignore IndexOutOfIndex.
            {
                return mid;
            }
            if(arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int []arr,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
