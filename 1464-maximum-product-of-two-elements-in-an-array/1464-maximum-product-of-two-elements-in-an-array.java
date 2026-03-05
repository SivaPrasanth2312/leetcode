class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        int sum1=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length>0){
                 sum =nums[nums.length-1]-1;
                 sum1=nums[nums.length-2]-1;
                count=sum1*sum;
            }
        }
       
        return count;
    }
}