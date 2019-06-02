//https://leetcode.com/problems/first-unique-character-in-a-string/

//Runtime: 15 ms, faster than 59.07% of Java online submissions for First Unique Character in a String.
//Memory Usage: 35.9 MB, less than 99.96% of Java online submissions for First Unique Character in a String.

//执行用时 : 32 ms, 在First Unique Character in a String的Java提交中击败了54.87% 的用户
//        内存消耗 : 47.6 MB, 在First Unique Character in a String的Java提交中击败了53.32% 的用户

class Solution {
    public int firstUniqChar(String s) {
        char[] str_arr = s.toCharArray();
        int index = 0;
        for(char x:str_arr){
            if(s.indexOf(x)==s.lastIndexOf(x)){
                return index;
            }
            index ++;
        }
        return -1;
    }
}