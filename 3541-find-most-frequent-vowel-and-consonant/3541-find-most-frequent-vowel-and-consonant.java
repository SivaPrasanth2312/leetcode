class Solution {
    public int maxFreqSum(String s) {
      HashMap<Character,Integer> map= new HashMap<>();
      for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }  
      int maxvow=0;
      int maxcon=0;
      for(Map.Entry<Character,Integer> hm:map.entrySet()){
        char c =hm.getKey();
        int count=hm.getValue();
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            maxvow=Math.max(maxvow,count);
        }else{
            maxcon=Math.max(maxcon,count);
        }
      }
      return maxvow+maxcon;
    }
}