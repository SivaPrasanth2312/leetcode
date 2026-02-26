class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                list.add(nums[i]);
            }
            else if (nums[i]==pivot){
                list2.add(nums[i]);
                }else{
                list1.add(nums[i]);
            }
        }
        ArrayList<Integer> list3 = new ArrayList<>(list);
        list3.addAll(list2);
        list3.addAll(list1);
        
           System.out.print(list3);
           int []arr= new int[list3.size()];
           for(int i=0;i<list3.size();i++){
            arr[i]=list3.get(i);
           }
          return arr;
    }
}