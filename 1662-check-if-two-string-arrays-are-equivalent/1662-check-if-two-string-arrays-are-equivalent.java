class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String nu:word1){
            sb.append(nu);
        }
        StringBuilder sb1 = new StringBuilder();
         for(String nu:word2){
            sb1.append(nu);
        }
        return sb.toString().equals(sb1.toString());
    }
}