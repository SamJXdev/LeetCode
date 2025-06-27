class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        
        int ans =10;
        int start = 9;
        int possibilities =9;

        while(n>1 && start>0){
            possibilities *=start;
            ans += possibilities;
            start--;
            n--;
        }
        return ans;
    }
}