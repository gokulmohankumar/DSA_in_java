package _8_BitwiseOperations;

public class AddBinary {
    public static void main(String[] args) {
        String a="1111";
        String b="1111";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;

        int carry=0;

        StringBuffer res=new StringBuffer();
        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0)
            {
                sum+=(a.charAt(i)-'0');
            }
            if(j>=0)
            {
                sum+=(b.charAt(j)-'0');
            }
            if(sum%2==0)
            {
                res.insert(0,"0");
            }
            else {
                res.insert(0,"1");
            }
            carry=(sum>1)?1:0;
            i--;
            j--;
        }
        if(carry==1)
        {
            res.insert(0,"1");
        }
        return res.toString();
    }
}
