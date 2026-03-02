class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
         int left =0;
         int right=nums.length-1;
        
         ArrayList<Double> list= new ArrayList<>();
         while(right>0 ){ 
            if(left>right){
                break;
            }else{
            Double sum=(nums[left]+nums[right])/2.0;
            
            list.add(sum);
            left++;
            right--;
           
         }
         }
         double res=Collections.min(list);
         System.out.print(list);
         return res;
    }
}