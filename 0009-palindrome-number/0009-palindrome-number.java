class Solution {
    public boolean isPalindrome(int x) {
        int rx=0;
        int c=x;
        while(x!=0){
            rx=rx*10+(x%10);
            x/=10;
        }
        if(c==rx && c>=0){
            return true;
        }
        return false;
    }
}