class Solution {
    public String mergeAlternately(String word1, String word2) {
        ArrayList<Character>list= new ArrayList<>();
        for(char nu:word1.toCharArray()){
            list.add(nu);
        }
           ArrayList<Character>list1= new ArrayList<>();
        for(char nu:word2.toCharArray()){
            list1.add(nu);
        }
         ArrayList<Character>list2= new ArrayList<>();
          int i=0;
           int j=0;
           while(i<list.size() && j<list1.size()){
            list2.add(list.get(i++));
            list2.add(list1.get(j++));
           }
        while(i<list.size()){
            list2.add(list.get(i++));
        }
        while(j<list1.size()){
            list2.add(list1.get(j++));
        }
         String b ="";
         for(int k=0;k<list2.size();k++){
            b+=list2.get(k);
         }
         System.out.print(b);
        return b+"";
    }
}