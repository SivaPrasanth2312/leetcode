class Solution {
    public int[] transformArray(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(0);
            }else{
                list.add(1);
            }
        }
        Collections.sort(list);
        int arr[]= new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
        return arr;
    }
}