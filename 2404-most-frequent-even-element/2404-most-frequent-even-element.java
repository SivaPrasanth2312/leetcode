class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int nu:nums){
            if(nu%2==0){
            map.put(nu,map.getOrDefault(nu,0)+1);
        }
        }
        int res=-1;
        int mx=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int x =entry.getKey();
            int t =entry.getValue();
            if(mx < t || (mx == t && res> x)){
                mx =t;
                res=x;
            }
        }
        System.out.print(res);
        return res;
    }
}