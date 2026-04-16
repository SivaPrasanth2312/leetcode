class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int max =0;
        int min=Integer.MAX_VALUE;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            max =Math.abs(i-start);
           min=Math.min(max,min);
        }
     }   
     return min;
    }
}