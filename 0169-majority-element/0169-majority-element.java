class Solution {
    public int majorityElement(int[] arr) {
        int kmax=0;
        int max =0;
         HashMap<Integer,Integer> map= new HashMap<>();
         for(int i=0;i<arr.length;i++){
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
             int key=entry.getKey();
             int value=entry.getValue();
             if(max<value){
                 kmax=key;
                 max =value;
                 
             }
         }
         return kmax;
    }
}