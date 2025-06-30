class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Rearrange elements to their correct positions
        for (int i = 0; i < n; i++) {
            while (
                nums[i] > 0 && 
                nums[i] <= n && 
                nums[i] != nums[nums[i] - 1]
            ) {
                int correctIndex = nums[i] - 1;
                // Swap nums[i] and nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Step 2: Find the first index where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all positions are correct, return n + 1
        return n + 1;
    }
}
