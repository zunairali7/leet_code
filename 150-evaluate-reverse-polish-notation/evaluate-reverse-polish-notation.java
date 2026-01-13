import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] tokens1 = {"2","1","+","3","*"};
        System.out.println(solution.evalRPN(tokens1)); // Output: 9

        String[] tokens2 = {"4","13","5","/","+"};
        System.out.println(solution.evalRPN(tokens2)); // Output: 6

        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(solution.evalRPN(tokens3)); // Output: 22
    }
}