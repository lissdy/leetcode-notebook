//https://leetcode.com/problems/4sum-ii/
//454. 4Sum II

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        Map<Integer, Integer> ab_map = new HashMap<Integer, Integer>();
        for(int a:A){
            for(int b:B){
                ab_map.put(a+b,ab_map.getOrDefault(a+b,0) + 1);
            }
        }

        for(int c:C){
            for(int d:D){
                result += ab_map.getOrDefault(-(c+d), 0);
            }
        }
        return result;
    }
}