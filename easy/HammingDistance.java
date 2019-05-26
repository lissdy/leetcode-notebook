//https://leetcode.com/problems/hamming-distance/
//461. Hamming Distance

class Solution {
    public int hammingDistance(int x, int y) {
        String sx = Integer.toBinaryString(x);
        String sy = Integer.toBinaryString(y);
        int move = sx.length() - sy.length();
        if(move < 0){
            for(int i=0;i<-move;i++){
                sx = "0"+sx;
            }
        }else{
            for(int j=0;j<move;j++){
                sy="0"+sy;
            }
        }

        char[] bx = sx.toCharArray();
        char[] by = sy.toCharArray();
        int result = 0;
        for(int i=0;i<bx.length;i++){
            if(bx[i]!=by[i]){
                result ++;
            }
        }
        return result;
    }
}