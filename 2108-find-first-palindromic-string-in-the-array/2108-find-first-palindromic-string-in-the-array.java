class Solution {
    public String firstPalindrome(String[] words) {
       
        for(String nu:words){
           String b= new StringBuilder(nu).reverse().toString();
           if(b.equals(nu)){
            return b;
           }
        }
                    return "";

    }
}