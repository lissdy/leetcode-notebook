//Runtime: 3 ms, faster than 69.72% of Java online submissions for Two Sum.
//        Memory Usage: 36.3 MB, less than 99.79% of Java online submissions for Two Sum.
//
//        执行用时 : 9 ms, 在Two Sum的Java提交中击败了77.05% 的用户
//        内存消耗 : 39.2 MB, 在Two Sum的Java提交中击败了46.38% 的用户

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dir = new HashMap<Integer,Integer>(nums.length);
        int[] result = {0,0};
        for(int i=0;i<nums.length;i++){
            dir.put(nums[i],i);
        }

        for(int j=0;j<nums.length;j++){
            int sec = target - nums[j];
            if(dir.containsKey(sec) && dir.get(sec)!=j){
                result[0] = j;
                result[1] = dir.get(sec);
                return result;
            }
        }
        return result;
    }
}