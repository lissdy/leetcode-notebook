class Solution {
    public String reverseParentheses(String s) {
        char[] c = s.toCharArray();
        StringBuffer result = new StringBuffer("");
        int[] inter_position = internalParentheses(c);
        while (inter_position[0] != 0 || inter_position[1] != 0) {
            for (int i = 0; i < inter_position[0]; i++) {
                result.append(String.valueOf(c[i]));
            }
            for (int i = inter_position[1] - 1; i > inter_position[0]; i--) {
                result.append(String.valueOf(c[i]));
            }
            for (int i = inter_position[1] + 1; i < c.length; i++) {
                result.append(String.valueOf(c[i]));
            }
            inter_position = internalParentheses(result.toString().toCharArray());
        }
        return result.toString();
    }


    int[] internalParentheses(char[] c) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < c.length; i++) {
            if (String.valueOf(c[i]).equals("(") && i <= left) {
                left = i;
            }
            if (String.valueOf(c[i]).equals(")")) {
                right = i;
                break;
            }
        }
        return new int[]{left, right};
    }

}