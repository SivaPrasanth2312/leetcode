class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list = new ArrayList<>();
       while(n!=0){
        int rev =n%10;
        list.add(rev);
        n=n/10;
       }
     
       Collections.sort(list);
       int sum =0;
       for(int i=0;i<list.size();i++){
        sum=list.get(list.size()-2)*list.get(list.size()-1);
       }
        return sum;
    }
}