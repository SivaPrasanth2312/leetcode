class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(String nu:words){
           boolean isfount=true;
            for(int i=0;i<nu.length();i++){
                if(!set.contains(nu.charAt(i))){
                   isfount=false;
                   break;
                }
            }
            if(isfount){
                count++;
            }
        }
        
        System.out.print(count);
        return count;
    }
}