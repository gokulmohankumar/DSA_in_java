package _5_BinarySearch;

//Link of question in leetcode: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[]arr={'c','f','g'};
        char target='f';
        System.out.println(findSmallest(arr,target));
    }

    private static char findSmallest(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return (char)letters[start%letters.length];
    }
}

