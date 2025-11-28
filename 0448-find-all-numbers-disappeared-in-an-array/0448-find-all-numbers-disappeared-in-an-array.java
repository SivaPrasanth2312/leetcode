class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max=nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int mis:nums){
            set.add(mis);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=max;i++){
          if(!set.contains(i)){
            list.add(i);
          }
        }
        return list;
    }
}