//https://leetcode.com/problems/sum-of-square-numbers/
//633. Sum of Square Numbers

public class Solution {
    public boolean judgeSquareSum(int c) {
        int right =  (int)Math.sqrt(c);
        for(int i=0;i<=right;i++){
            int left = c - i*i;
            if ((int)Math.sqrt(left) - Math.sqrt(left) == 0){
                return true;
            }
        }
        return false;
    }
}