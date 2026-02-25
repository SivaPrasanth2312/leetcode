class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        ArrayList<Integer>list = new ArrayList<>();
         ArrayList<Integer>list2 = new ArrayList<>();
        for(int nu:seats){
            list.add(nu);
        }
        for(int num:students){
            list2.add(num);
        }
        int max=0;
       Collections.sort(list);
       Collections.sort(list2);
        ArrayList<Integer>list3= new ArrayList<>();
        for(int i=0;i<list.size();i++){
               int  count=Math.abs(list.get(i)-list2.get(i));
                list3.add(count);
                max+=count;
            
            
        }
        
       
        return max;
        
    }
}