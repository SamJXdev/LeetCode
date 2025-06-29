class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign = true;
        if((dividend>=0 && divisor<0)||(dividend<=0 && divisor>0)){
            sign = false;
        }

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        long quotient = 0;

        while(a>=b){
            int count = 0;
            while(a>=b<<(count+1)){
                count++;
            }
            quotient += 1L << count;
            a -= b <<count;
        }

        if(quotient>=1L<<31){
            return sign ? Integer.MAX_VALUE: Integer.MIN_VALUE;
        }

        return sign ? (int)quotient: (int)-quotient;
    }
}