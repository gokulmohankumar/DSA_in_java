package _10_Recursions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        //testcase 1
        int[]arr1={10,20,30,8,9};
        int target1=20;
        System.out.println(target1+" at the index "+search(arr1,target1,0,arr1.length-1));//expect 1
        //test case 2
        int[]arr2={34,35,36,37,38,28,30,32};
        int target2=32;
        System.out.println(target2+" at the index "+search(arr2,target2,0,arr2.length-1)); //expect 7
        //testcase 3
        int[]arr3={40,50,60,70,80,90,10,20,30};
        int target3=90;
        System.out.println(target3+" at the index "+search(arr3,target3,0,arr3.length-1)); //expect 5
    }
    public static int search(int[] arr,int target,int s,int e)
    {
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if(arr[s]<=target && arr[m]>target)
            {
                return search(arr,target,s,m-1);
            }
            else {
                return search(arr,target,m+1,e);
            }
        }
        if(target>arr[m] && target<=arr[e])
        {
            return search(arr,target,m+1,e);
        }
        else {
            return search(arr,target,s,m-1);
        }
    }
}
