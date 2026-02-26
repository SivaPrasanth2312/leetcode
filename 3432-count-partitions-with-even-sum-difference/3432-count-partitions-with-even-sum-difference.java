class Solution {
    public int countPartitions(int[] nums) {
        int sum =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==0){
            for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            count++;
        }
        }else{
            return 0;
        }
        
        //System.out.print(count);
        return count-1;
    }
}