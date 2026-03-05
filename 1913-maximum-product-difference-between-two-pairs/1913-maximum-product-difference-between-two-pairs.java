class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        // int sum=0;
        // int sum1=0;
        for(int i=0;i<nums.length;i++){
           int sum =nums[nums.length-1]*nums[nums.length-2];
          int sum1=nums[0]*nums[1];
            count=sum-sum1;
        }
        return count;
    }
}