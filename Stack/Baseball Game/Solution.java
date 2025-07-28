import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str : operations) {
            switch(str) {
                case "C" :
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int x = stack.pop();
                    int y = stack.pop();

                    stack.push(y);
                    stack.push(x);
                    stack.push(x+y);
                    break;

                default: 
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}