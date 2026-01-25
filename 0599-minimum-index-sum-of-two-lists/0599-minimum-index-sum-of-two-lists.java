class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    ArrayList<String>li1 =new ArrayList<>();
    for(int i=0;i<list1.length;i++){
    li1.add(list1[i]);
    }
    ArrayList<String>li2 =new ArrayList<>();
     for(int i=0;i<list2.length;i++){
    li2.add(list2[i]);
     }
  
    ArrayList<String>li3 =new ArrayList<>();
    int minsum=Integer.MAX_VALUE;
    
  for(int i=0;i<li1.size();i++){
    for(int j=0;j<li2.size();j++){
        if(li1.get(i).equals(li2.get(j))){ 
            int sum =i+j;
        if(sum<minsum){
            li3.clear();
            li3.add(li1.get(i));
            minsum=sum;
        }else if(sum==minsum){
            li3.add(li1.get(i));
        }
        }
    }
  }
    String arr[]=new String[li3.size()];
    for(int i=0;i<li3.size();i++){
        arr[i]=li3.get(i);
    }
   return arr;
    }
}