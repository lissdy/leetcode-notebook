执行用时 : 1 ms, 在Number of Lines To Write String的Java提交中击败了99.07% 的用户
        内存消耗 : 34.1 MB, 在Number of Lines To Write String的Java提交中击败了95.71% 的用户

        https://leetcode-cn.com/problems/number-of-lines-to-write-string/submissions/

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        HashMap dir = new HashMap();
        int[] result = {0,0};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        for(char letter:alphabet.toCharArray()){
            dir.put(letter,widths[index]);
            index ++;
        }

        for(char s:S.toCharArray()){
            int length = Integer.parseInt(dir.get(s).toString());
            if(result[1] + length > 100){
                result[1] = length;
                result[0]++;
            }else{
                result[1] = result[1] + length;
            }
        }
        if(result[1]!=0){
            result[0]++;
        }
        return result;
    }
}
//优化： 可以不用hashmap保存dir，直接widths[s-'a']
class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        HashMap dir = new HashMap();
        int[] result = {0,0};

        for(char s:S.toCharArray()){
            int length = widths[s-'a'];
            if(result[1] + length > 100){
                result[1] = length;
                result[0]++;
            }else{
                result[1] = result[1] + length;
            }
        }
        if(result[1]!=0){
            result[0]++;
        }
        return result;
    }
}