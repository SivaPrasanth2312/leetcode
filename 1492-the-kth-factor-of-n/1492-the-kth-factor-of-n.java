class Solution {
    public int kthFactor(int n, int k) {
        int fact =1;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=1;i<=n;i++){
           if(n%i==0)
               
             list.add(i);
        }
      
       if(list.size()<k){
            return -1;
        }
            
        
       
       
        System.out.print(list);
       
       
        return list.get(k-1);
    }
}