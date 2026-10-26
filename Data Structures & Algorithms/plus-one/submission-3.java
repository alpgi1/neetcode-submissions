class Solution {
    public int[] plusOne(int[] digits) {
        int extra = 1;
        int i = digits.length -1;
        while(extra > 0 && i >= 0){
            if(i == 0 && digits[i] == 9){
                int[] ret = new int[digits.length+1];
                digits[0] = 0;
                ret[0] = 1;
                for(int f = 1; f < digits.length+1; f++){
                    ret[f] = digits[f-1];
                }
                return ret;
            }
            if(digits[i] == 9){
                digits[i] = 0;
                i--;
            }else{
                digits[i]++;
                extra--;
            }
        }
        return digits;
    }
}
