class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            
            if(count<k){
                sum+=nums[i];
                count++;
            }
           
        }
        int sum1=0;
        int count1=0;
        for(int i=nums.length-1;i>=0;i--){
            
            if(count1<k){
                sum1+=nums[i];
                count1++;
            }
           
        }
       
        return Math.abs(sum1-sum);
    }
}