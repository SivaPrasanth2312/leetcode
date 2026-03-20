class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
           int sum=nums[nums.length-1]-nums[i];
           int max =Math.abs(sum);
          
           count+=sum;
            System.out.print(count);
        }
        return count;
    }
}