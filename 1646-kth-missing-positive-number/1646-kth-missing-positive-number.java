class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int num = 1;
        int i = 0;

        while (true) {
            if (i < arr.length && arr[i] == num) {
                i++; 
            } else {
                missingCount++; 
                if (missingCount == k) {
                    return num;
                }
            }
            num++; 
        }
    }
}
