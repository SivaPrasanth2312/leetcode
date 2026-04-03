class Solution {
    public boolean hasSameDigits(String s) {
        //int b =Integer.parseInt(s);
        ArrayList<Integer>list= new ArrayList<>();
        // while(b!=0){
        //     int rev =b%10;
        //     list.add(rev); 
        //     b=b/10;
        // }
        for(char c:s.toCharArray()){
            list.add(c-'0');
        }

        
        int sum =0;
        while(list.size()>2){
            ArrayList<Integer>list1= new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            sum=list.get(i)+list.get(i+1);
            int ad=sum%10;
            list1.add(ad);
        }
        list=list1;
        }

       // System.out.print(list1);
        return list.get(0).equals(list.get(1));
    }
}