class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for binary search efficiency
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0, right = m;
        int medianPos = (m + n + 1) / 2; // Position of left half count

        while (left <= right) {
            int i = (left + right) / 2;   // Partition index for nums1
            int j = medianPos - i;       // Partition index for nums2

            // Get left and right elements (handling edge cases)
            int nums1Left = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1Right = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2Left = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2Right = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Check if the partition is correct
            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                // If total length is odd, return max of left half
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                }
                // If total length is even, return average of two middle values
                return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
            }
            // Adjust binary search range
            else if (nums1Left > nums2Right) {
                right = i - 1; // Move left
            } else {
                left = i + 1; // Move right
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }
}
