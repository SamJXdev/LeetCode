class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: Division by zero
        if (divisor == 0) return Integer.MAX_VALUE;
        
        // Edge case: Overflow (MIN_VALUE / -1 = MAX_VALUE + 1 → overflow)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Work with negative numbers to avoid abs() issues with MIN_VALUE
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        
        int result = 0;
        
        while (dividend <= divisor) {
            int tempDivisor = divisor;
            int count = 1;
            
            // Double the divisor until it exceeds the remaining dividend
            while (dividend - tempDivisor <= tempDivisor) {
                tempDivisor <<= 1; // Multiply by 2
                count <<= 1;        // Multiply count by 2
            }
            
            dividend -= tempDivisor;
            result += count;
        }
        
        return isNegative ? -result : result;
    }
}