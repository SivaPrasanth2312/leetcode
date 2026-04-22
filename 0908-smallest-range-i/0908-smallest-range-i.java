class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min =Integer.MAX_VALUE;
        int max =0;
        int res =0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max =Math.max(nums[i],max);}
            min+=k;
            max-=k;
        //    if(nums[i]>0){
        //     return 0;
        //    }
            res =Math.max(0,(max-min));
        
         
        return res;
    }
}