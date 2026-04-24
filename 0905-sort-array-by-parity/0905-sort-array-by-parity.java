class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
        }
        
        int k=0;
        int arr[]= new int[nums.length];
        for(int i=0;i<list.size();i++){
            arr[k++]=list.get(i);
          
        }
          for(int i=0;i<list1.size();i++){
         
            arr[k++]=list1.get(i);
        }
        System.out.print(arr);
        return arr;
    }
}