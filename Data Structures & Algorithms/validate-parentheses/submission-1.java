class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        /*
        A. Start iterating over the string
            1. push all opening parenthesis
            2. whenever any closing parenthesis comes check if corresponding opening parenthesis is present
            2.1. if corresponding opening paranthesis not found return false
            2.2 if found pop that element

        B.1 If stack is empty return true
        B.2 else false 

        */

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' )
                stack.addLast(ch);
            else {
                if (stack.isEmpty())
                 return false;
                
                Character top = stack.getLast();

                switch (ch) {
                    case ')': 
                        if (top != '(')
                            return false;
                        break;
                    
                    case '}': 
                        if (top != '{')
                            return false;
                        break;
                    
                    case ']': 
                        if (top != '[')
                            return false;
                    break;
                }
                stack.removeLast();
            }
        }

        if(stack.isEmpty())
            return true;
        return false;
    }
}
