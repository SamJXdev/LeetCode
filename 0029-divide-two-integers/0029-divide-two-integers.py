class Solution(object):
    def divide(self, dividend, divisor):
        if dividend == divisor:
            return 1
        
        sign = True

        if (dividend >=0 and divisor<0) or (dividend<=0 and divisor>0):
            sign = False

        a= abs(dividend)
        b=abs(divisor)
        quotient = 0

        while a>=b:
            count =0
            while a>=b<<(count+1):
                count+=1
            quotient += 1<<count
            a -= b<<count

        if quotient>=(1<<31):
            return (2**31)-1 if sign else -(2**31)
        
        return quotient if sign else -quotient

        