class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int orginal=n;
     while(n!=0){
        int rev=n%10;
        sum+=rev;
        mul*=rev;
        n=n/10;
     }
     

     return orginal % (sum + mul) == 0?true:false;
    }
}