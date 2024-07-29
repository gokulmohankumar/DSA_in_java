package _5_BinarySearch;

public class FindPivotinDuplicate {
    public static void main(String[] args) {
        int []arr={2,9,2,2,2,2};
        int pivot=findPivotwithDuplicates(arr);
        System.out.println(pivot);
    }
    static int findPivotwithDuplicates(int[]arr)
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
            //if elements at middle ,start,end are equal ,just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
               if(arr[start]>arr[start+1])
               {
                   return start;
               }
                start++;
               if(arr[end]<arr[end-1])
               {
                   return end-1;
               }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
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
