class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                char match = ' ';
                if(stack.isEmpty()){
                    return false;
                }
                if(ch==')'){
                    match ='('; 
                }else if(ch=='}'){
                    match='{';
                }else{
                    match='[';
                }
                if(match==stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}