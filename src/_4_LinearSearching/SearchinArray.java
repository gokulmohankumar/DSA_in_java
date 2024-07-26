package _4_LinearSearching;

public class SearchinArray {
    private static int search(int[]arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for (int i = 0; i<arr.length; i++) {
            int element=arr[i];
            if(element==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={23,45,67,54,2,1,3,4,56,78,32};
        int target=56;
        int ans=search(nums,target);
        System.out.println(ans);
    }
}
