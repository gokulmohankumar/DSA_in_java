package _1_FlowOfProgram;
import java.util.Scanner;

public class OptimizedPrimeNumber {

    //time complexity O(root(n)
    public static String checkPrime(int n)
    {
        if(n<=1)
            return("Neither prime nor composite");
        else {
            int c=2;
            while((c*c)<=n)
            {
                if(n%c==0) {
                    return ("Not a prime number");
                }
                c++;
            }
            return(n + " It ia a prime number!");
        }
    }
//time complexity for this also O(root(n)) but more efficient than above algorithm
//    public static boolean checkPrime(int n)
//    {
//        if(n==1) return false;
//        if(n==2 || n==3) return true;
//        if(n%2==0 || n%3==0) return false;
//        for(int i=5;i*i<=n;i+=6)
//        {
//            if(n%i==0 || n%(i+2)==0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to check whether prime ");
        int n=in.nextInt();
        System.out.println(checkPrime(n));
    }
}
