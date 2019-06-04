//https://leetcode.com/problems/reverse-integer/submissions/

//执行用时 : 10 ms, 在Reverse Integer的Java提交中击败了58.04% 的用户
//        内存消耗 : 34.2 MB, 在Reverse Integer的Java提交中击败了78.17% 的用户
//
//        Runtime: 3 ms, faster than 41.83% of Java online submissions for Reverse Integer.
//        Memory Usage: 33.6 MB, less than 54.81% of Java online submissions for Reverse Integer.

class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        boolean pos = true;
        if (x<0) {
            pos = false;
            x = 0-x;
        }
        char[] stack = String.valueOf(x).toCharArray();
        String tmp_result = "";
        int result = 0;
        for(int i=stack.length-1;i>=0;i--){
            if (!(stack[i]=='0'&&tmp_result=="")){
                tmp_result = tmp_result+ String.valueOf(stack[i]);
            }

        }
        try{
            result = Integer.parseInt(tmp_result);
        }catch (NumberFormatException e) {
            result = 0;
        }


        if (!pos) result=0-result;
        return result;
    }
}