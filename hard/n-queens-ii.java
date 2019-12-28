class Solution {
    int count = 0;
    int[] result;
    public int totalNQueens(int n) {
        result = new int[n];
        calQueens(0);
        return count;
    }

    private void calQueens(int row){
        if(row == result.length){
            count ++;
        }
        for(int column = 0; column < result.length; column++){
            if(isOk(row,column)){
                result[row] = column;
                calQueens(row+1);
            }
        }
    }

    private boolean isOk(int row, int column){
        int leftup = column -1, rightup = column + 1;
        for(int i = row -1; i >= 0; i--){
            if(result[i]==column) return false;
            if(leftup >= 0){
                if(result[i]==leftup) return false;
            }
            if(rightup < result.length){
                if(result[i]==rightup) return false;
            }
            leftup--; rightup++;
        }
        return true;
    }
}