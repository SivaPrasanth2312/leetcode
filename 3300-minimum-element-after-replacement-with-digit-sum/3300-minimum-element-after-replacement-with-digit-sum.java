class Solution {
    public int minElement(int[] nums) {
        int sum =0;
        ArrayList<Integer>list = new ArrayList<>();
    
     for(int i=0;i<nums.length;i++){
         sum=0;
         int num=nums[i];
        while(num>0){
            int rev =num%10;
            sum+=rev;
           num=num/10;
        }
         list.add(sum);
       
       
     }   
     int res=Collections.min(list);
     return res;
    }
}