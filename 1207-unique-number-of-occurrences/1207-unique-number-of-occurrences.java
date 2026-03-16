class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int nu:arr){
            map.put(nu,map.getOrDefault(nu,0)+1);
        }
         ArrayList<Integer> list= new ArrayList<>();
        for(int num:map.values()){
            if(list.contains(num)){
                return false;
            }list.add(num);
        }
        return true;
}
}