class Solution {
    public int[] finalPrices(int[] nums) {
           ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<=nums[i]){
                     sum =nums[i]-nums[j];
                   break;

                }
               
                
            }
              list.add(sum);
        }
       int arr[]= new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
        return arr;
    }
}