class Solution {
    public int sumOfEncryptedInt(int[] nums) {
       int sum=0;
       
       ArrayList<Integer>list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             int count=0;
             int num=nums[i];
            while(num!=0){
                list.add(num%10);
                num=num/10;
                count++;

            }
            if(count==1){
                sum+=Collections.max(list);
            }else{
            String b =String.valueOf(Collections.max(list));
                String c="";
                for(int j=0;j<count;j++){
                   c+=b;
                }
                sum+=Integer.parseInt(c);
            }
            list.clear();
        }
       
        return sum;
    }
}