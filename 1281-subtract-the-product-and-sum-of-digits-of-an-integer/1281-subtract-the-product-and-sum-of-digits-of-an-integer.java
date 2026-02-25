class Solution {
    public int subtractProductAndSum(int n) {
        int res=0;
        int sum =0;
        int product=1;
        for(int i=0;i<n;i++){
            while(n>0){
                 int rev = n%10;
                sum+=rev;
                 product =product*rev;
                n=n/10;
               

            }
             
        }
        res=product-sum;
            return res;
    }
}