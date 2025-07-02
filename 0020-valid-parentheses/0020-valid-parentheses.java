class Solution {
    public boolean isValid(String s) {
        Stack<Character> ramya=new Stack<>();
      for(  char c:s.toCharArray())
      {
        if(c=='(' ||c=='[' || c=='{')
        {
            ramya.push(c);
        }
        else
        {
            if(ramya.isEmpty())
            {
                return false;
            }
            char tot=ramya.pop();
            if(c==')' && tot != '(' || c==']' && tot != '[' ||c=='}' && tot != '{' )
            {
                return false;
            }
        }
      }
        return ramya.isEmpty();
    }
}