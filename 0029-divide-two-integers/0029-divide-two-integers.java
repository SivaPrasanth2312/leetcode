class Solution {
    public int divide(int dividend, int div) {
         if(dividend==Integer.MIN_VALUE && div == -1){
            return Integer.MAX_VALUE;
        }
        int count= dividend /div;
        
        return count;
    }
}