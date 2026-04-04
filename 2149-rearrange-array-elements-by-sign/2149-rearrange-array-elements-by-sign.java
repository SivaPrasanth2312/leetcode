class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>list= new ArrayList<>();
        ArrayList<Integer>list1= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
        }
        int k=0;
        int res[]= new int[nums.length];
        for(int i=0;i<list.size();i++){
           
                res[k++]=list.get(i);
                res[k++]=list1.get(i);
            }
        
        
        return res;
    }
}