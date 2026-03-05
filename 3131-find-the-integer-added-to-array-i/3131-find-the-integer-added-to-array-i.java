class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        ArrayList<Integer>list= new ArrayList<>();
          ArrayList<Integer>list1= new ArrayList<>();
      for(int nu:nums1){
        list.add(nu);
      }
       for(int nu:nums2){
        list1.add(nu);
      }
      int min=Collections.min(list);
      int min1=Collections.min(list1);
      System.out.print(min);
       System.out.print(min1);
      int res =min1-min;
      return res;
    }
}