class Solution {
    public int[] concatWithReverse(int[] nums) {
       ArrayList<Integer>list = new ArrayList<>();
       for(int rev:nums){
        list.add(rev);
       }
       Collections.reverse(list);
      
       ArrayList<Integer>list1= new ArrayList<>();
       for(int n:nums){
        list1.add(n);
       }
       list1.addAll(list);
        System.out.print(list1);
        int res[]=new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            res[i]=list1.get(i);
        }
       return res;
    }
}