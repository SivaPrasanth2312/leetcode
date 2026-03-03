class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int nu:nums){
            list.add(nu);
            
        }
        int count=0;
        if(list.contains(target)){
           count =list.indexOf(target);
        }else {
            list.add(target);
            Collections.sort(list);
             count =list.indexOf(target);

        }
        return count;
    }
}