class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>list = new ArrayList<>();
        for(char nu:s.toCharArray()){
            list.add(nu);
        }
        ArrayList<Integer>list1= new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if("aeiouAEIOU".indexOf(list.get(i))!=-1){
                int ascii=(int)(list.get(i));
                list1.add(ascii);
            }
        }
        
        Collections.sort(list1);
          ArrayList<Character>list2= new ArrayList<>();
        for(int i=0;i<list1.size();i++){
             char ch =(char)(int)list1.get(i);
             list2.add(ch);
        }
       
        String b="";
        int k=0;
        for(int i=0;i<list.size();i++){
           
            if("aeiouAEIOU".indexOf(list.get(i))!=-1){
                b+=list2.get(k);
                k++;
            }else{
                b+=list.get(i);
            }
        }
        
        System.out.print(b);
        return b;
    }
}