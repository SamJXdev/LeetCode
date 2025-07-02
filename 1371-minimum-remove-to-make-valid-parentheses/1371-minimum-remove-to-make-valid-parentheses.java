class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder temp = new StringBuilder();
        int open = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                open++;
                temp.append(c);
            }
            else if(c==')'){
                if(open>0){
                open--;
                temp.append(c);
                }
            }
            else{
                temp.append(c);
            }
            }
        StringBuilder result = new StringBuilder();
        int closed = 0;
        for(int i=temp.length()-1;i>=0;i--){
            char c = temp.charAt(i);
            if(c==')'){
                closed++;
                result.append(c);
            }
            else if(c=='('){
                if(closed>0){
                closed--;
                result.append(c);
                }
            }
            else{
                result.append(c);
            }
        }
        return result.reverse().toString();
        }
    }