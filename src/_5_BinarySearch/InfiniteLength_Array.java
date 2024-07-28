package _5_BinarySearch;

public class InfiniteLength_Array {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90, 100, 102, 122, 155,159};
        int target = 34;
        System.out.println(findAnswer(arr,target));
    }
    static int findAnswer(int[]arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end + (end - start +1) * 2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
