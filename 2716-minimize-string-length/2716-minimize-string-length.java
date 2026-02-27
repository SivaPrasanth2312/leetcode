class Solution {
    public int minimizedStringLength(String s) {
       HashSet<Character>set = new HashSet<>();
       for(char nu:s.toCharArray()){
        set.add(nu);
       }
       int count=0;
       for(int i=0;i<set.size();i++){
        count++;
       }
       
       return count;
    }
}