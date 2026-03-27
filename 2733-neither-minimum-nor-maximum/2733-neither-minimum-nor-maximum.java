class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max =Integer.MIN_VALUE;
         int min =Integer.MAX_VALUE;
            for(int nu:nums){
               max =Math.max(nu,max);
                min =Math.min(nu,min);
            }
            for(int nu:nums){
                if(nu!=max && nu!=min){
                    return nu;
                }
            }
            return -1;
    }
}