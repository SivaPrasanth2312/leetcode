class Solution {
    public int dominantIndex(int[] nums) {
        ArrayList<Integer> li1= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             li1.add(nums[i]);
        }
     int sum=Collections.max(li1);
    int sum1=li1.indexOf(sum);
    for(int nu:nums){
        if(nu!=sum && sum<2*nu){
            return -1;
        }
    }
     return sum1;
    }
}