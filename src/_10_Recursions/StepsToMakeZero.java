package _10_Recursions;
//QuestionLink: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class StepsToMakeZero {
        public static void main(String[] args) {
            int num=8;
            int ans=numberOfSteps(num);
            System.out.println(ans);
        }
        public static  int numberOfSteps(int num) {
            if(num==0)
            {
                return 0;
            }
            int count=0;
            if(num%2==0)
            {
                num=num/2;
            }
            else {
                num=num-1;
            }
            count++;
            count+=numberOfSteps(num);
            return count;
        }
    }

