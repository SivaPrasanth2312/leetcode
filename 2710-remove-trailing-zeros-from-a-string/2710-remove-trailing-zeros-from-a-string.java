class Solution {
    public String removeTrailingZeros(String num) {
     ArrayList<Character>list = new ArrayList<>();
        for(char nu:num.toCharArray()){
            list.add(nu);
        }
        String b="";
        Collections.reverse(list);
        boolean found=false;
       for(char nu:list){
      if(nu!='0'){
        found=true;
      }if(found){
        b+=nu;
      }
       }
       String res="";
       for(int i=b.length()-1;i>=0;i--){
        res+=b.charAt(i);
       }
        System.out.print(res);
        return res;
    }
}