class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char x : s.toCharArray()) {
            if (x == 'B' && !stack.isEmpty() && stack.peek() == 'A') {
                stack.pop();
            } else if (x == 'D' && !stack.isEmpty() && stack.peek() == 'C') {
                stack.pop();
            } else {
                stack.push(x);
            }
        }
        
        return stack.size();
    }
}
