class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String oddPal = expandFromCenter(s, i, i);
            // Even length palindrome
            String evenPal = expandFromCenter(s, i, i + 1);

            // Update the longest string
            if (oddPal.length() > longest.length()) {
                longest = oddPal;
            }
            if (evenPal.length() > longest.length()) {
                longest = evenPal;
            }
        }

        return longest;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome
        return s.substring(left + 1, right);
    }
}