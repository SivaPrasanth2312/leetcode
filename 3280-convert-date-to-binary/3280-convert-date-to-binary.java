class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        String b ="";
        for(int i=0;i<arr.length;i++){
          
          int n =Integer.parseInt(arr[i]);
          String c =Integer.toBinaryString(n);
            b+=c+"-";
          
        }
        b=b.substring(0,b.length()-1);
        return b;
    }
}