class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;   // Ways to reach step 1
        int second = 2;  // Ways to reach step 2
        int third = 0;   // Will store ways to reach current step

        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return second; // 'second' holds the answer for step n
    }
}
