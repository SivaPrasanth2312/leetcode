class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>list = new ArrayList<>();
       
       
        for(int i=left ;i<=right;i++){
            int n = i;
            boolean isfound =true;  
            while(n!=0){
                int rev =n%10;
                if( rev==0||i%rev!=0){
                    isfound=false;
                    break;
                }
                
                n=n/10;
            }
            if(isfound){
            list.add(i);
            }
        }
       // System.out.print(list);
        return list;
    }
}