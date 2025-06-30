class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder cleaned = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
              stack.push(Character.toLowerCase(c));
              cleaned.append(Character.toLowerCase(c));
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        while(!(stack.isEmpty())){
            result.append(stack.pop());
        }
       if(result.toString().equals(cleaned.toString())){
        return true;
       }
       return false;  
    }
}