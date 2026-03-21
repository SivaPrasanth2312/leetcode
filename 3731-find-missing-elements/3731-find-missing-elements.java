class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       
        ArrayList<Integer>list= new ArrayList<>();
        ArrayList<Integer>list1= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int max =Collections.max(list);
        int min=Collections.min(list);
        for(int i=min;i<max;i++){
                if(!list.contains(i)){
                        list1.add(i);
                }
        }
        return list1;
    }
}