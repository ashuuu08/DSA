class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder nonZeroDigit= new StringBuilder();
        long sum =0;
        if(n==0) return 0;
        while(n!=0){
           int digit = n%10;
           if(digit != 0){
            nonZeroDigit.insert(0,digit);
            sum+=digit;
           }
           n/=10;
        }

        long number = Long.parseLong(nonZeroDigit.toString());
        return number*sum;

    }
}