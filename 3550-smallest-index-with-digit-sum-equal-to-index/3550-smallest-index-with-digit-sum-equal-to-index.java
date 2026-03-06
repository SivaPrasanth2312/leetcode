class Solution {
    public int smallestIndex(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        int sum =0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            sum=0;
            while(num>0){
                int rev =num%10;
                sum+=rev;
                num=num/10;
            }
            if(i==sum){
                 min=Math.min(i,min);
                   
               
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
      return min;
    }
}