class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for (char ch: s.toCharArray()) {
            if(!stack.empty() && isPair(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        return stack.isEmpty();
    }
    
    private boolean isPair(char c1, char c2) {
        return ((c1=='(' && c2==')') || (c1=='{' && c2=='}') || (c1=='[' && c2==']'));
    }
}