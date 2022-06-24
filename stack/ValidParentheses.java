// Valid Parentheses - https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
        
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            // Added for cases like "]" or "()]"
            if(stack.isEmpty() && (c==')' || c =='}' || c==']')) {
                return false;
            }
            //If it is an opening bracket, push it on to the stack.
            else if(c =='(' || c =='{' || c =='[') {
                stack.push(c);
            } else if(c==')') {
              //Empty check on stack has been put for cases like "]"
                if(!stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                // This else was added in all the if cases for "(])" <-- This test case
                } else {
                    return false;
                }
            } else if(c=='}') {
                if(!stack.isEmpty() && stack.peek()=='{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if(c==']') {
                if(!stack.isEmpty() && stack.peek()=='[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}