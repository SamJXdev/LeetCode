class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];  // tracks last seen positions (+1)
        int maxLen = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            start = Math.max(start, lastIndex[c]);  // if seen in window, move start
            maxLen = Math.max(maxLen, end - start + 1);
            lastIndex[c] = end + 1;  // store index+1 to differentiate default 0
        }

        return maxLen;
    }
}