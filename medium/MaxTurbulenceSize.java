//https://leetcode.com/problems/longest-turbulent-subarray/
//978. Longest Turbulent Subarray

//执行用时 : 720 ms, 在Longest Turbulent Subarray的Java提交中击败了5.33% 的用户
//        内存消耗 : 53.6 MB, 在Longest Turbulent Subarray的Java提交中击败了40.00% 的用户

//Runtime: 432 ms, faster than 5.14% of Java online submissions for Longest Turbulent Subarray.
//        Memory Usage: 42.6 MB, less than 96.99% of Java online submissions for Longest Turbulent Subarray.

//利用数组头尾指针思想
//改进：用了两个循环，时间复杂度略高
class Solution {
    public int maxTurbulenceSize(int[] A) {
        int max = 0;
        int turHead, turTail;
        int lenght = A.length;
        if(lenght==1) return 1;
        for(turHead=0;turHead<lenght;turHead++){
            for(turTail=turHead;turTail<lenght-2;turTail++){
                if(A[turTail] > A[turTail+1] && A[turTail+1] < A[turTail+2] || A[turTail] < A[turTail+1] && A[turTail+1] > A[turTail+2]  ){
                    if((turTail+2-turHead+1)>max){
                        max = turTail+2-turHead+1;
                    }
                }else{
                    break;
                }
            }
        }
        if(max==0){
            if(A[lenght-1]!=A[lenght-2]){
                max=2;
            }else{
                max=1;
            }
        }
        return max;
    }
}
