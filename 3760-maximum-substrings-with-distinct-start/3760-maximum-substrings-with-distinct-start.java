class Solution {
    public int maxDistinct(String s) {
      HashSet<Character>set= new HashSet<>();
      for(char nu:s.toCharArray()){
        set.add(nu);
      }
      
     // System.out.print(set.size());
      return set.size();
    }
}