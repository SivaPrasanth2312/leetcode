class Solution {
    public int countEven(int num) {
        int count=0;
      int sum=0;
        for(int i=1;i<=num;i++){
           sum=0;
             int nums=i;
            while(nums>0){
                int rev=nums%10;
                sum+=rev;
                nums=nums/10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}