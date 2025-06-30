class Solution {
    public double myPow(double x, int n) {
       double result = helper(x,Math.abs(n));
       return (n<0)? 1/result : result;
  
    }

       public double helper(double x,int n)
       {
       if(n==0) return 1;
       if(x==0) return 0;

       double result = helper(x,n/2);
       result = result*result;
       return (n%2==0)? result: result*x;
       }
}