class Solution {
    public boolean isBalanced(String num) {
        ArrayList<Character>list= new ArrayList<>();
        for(char nu:num.toCharArray()){
            list.add(nu);
        }
        int even =0;
        int odd=0;
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                even+=list.get(i)-'0';
            }else{
                odd+=list.get(i)-'0';
            }
        }
      if(even==odd){
        return true;
      }
     
      return false;
    }
}