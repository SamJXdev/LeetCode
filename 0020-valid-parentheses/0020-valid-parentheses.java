class Solution {
   public boolean isValid(String s) {
    Stack<Character> ramya = new Stack<>();
                                                  // [   ( ,]   ]
    for(char c: s.toCharArray()){
        if(c=='(' || c=='{' || c=='['){
            ramya.push(c);
        }
        else{
            if(ramya.isEmpty()){
                return false;
            }
            char top = ramya.pop();
            if( (c==')' && top!= '(') || (c=='}' && top!= '{' ) || ( c==']' && top!= '[') ){
                    return false;
                }
            }
        }
    return ramya.isEmpty();
}
}