class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char nu:s.toCharArray()){
           
            if(set.contains(nu)){
                return nu;
            }
            set.add(nu);
        }
        System.out.print(set);
        return '0';
    }
}