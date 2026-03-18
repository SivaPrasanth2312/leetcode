class Solution {
    public int sumBase(int n, int k) {
        String b = Integer.toString(n,k);
        int a=Integer.parseInt(b);
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;

        }
        return sum;
    }
}