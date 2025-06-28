class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i=1;i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
}
}

//int  num1 = 2,147,483,647  
//long num2 = 9,223,372,036,854,775,807