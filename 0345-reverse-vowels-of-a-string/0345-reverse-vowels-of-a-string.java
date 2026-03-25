class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character>list= new ArrayList<>();
        for(char ch :s.toCharArray()){
            list.add(ch);
        }
         ArrayList<Character>list1= new ArrayList<>();
         for(int i=0;i<list.size();i++){
         if("aeiouAEIOU".indexOf(list.get(i))!=-1){
            list1.add(list.get(i));
         }
         }
         Collections.reverse(list1);
          ArrayList<Character>list2= new ArrayList<>();
          int j=0;
         for(int i=0;i<list.size();i++){
             if("aeiouAEIOU".indexOf(list.get(i))!=-1){
            list2.add(list1.get(j));
            j++;
         }else{
            list2.add(list.get(i));
         }
         }
     
        String b="";
        for(char ch:list2){
            b+=ch;
        }
        
        return b+"";
    }
}