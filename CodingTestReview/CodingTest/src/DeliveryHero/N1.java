package DeliveryHero;

import java.util.Stack;

public class N1 {
//https://binarysearch.com/problems/Word-Machine

    public static void main(String[] args) {
        N1 test = new N1();
        String S = "4 5 6 - 7 +";
        System.out.println(test.solution(S));
    }

    public int solution(String S) {
        String[] str = S.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("POP")) {
                if (stack.isEmpty())
                    return -1;
                stack.pop();
            } else if (str[i].equals("DUP")) {
                if (stack.isEmpty())
                    return -1;
                stack.push(stack.peek());
            } else if (str[i].equals("+")) {
                if (stack.size() < 2)
                    return -1;
                stack.push(stack.pop() + stack.pop());
            } else if (str[i].equals("-")) {
                if (stack.size() < 2)
                    return -1;
                stack.push(stack.pop() - stack.pop());
            } else {
                stack.push(Integer.parseInt(str[i]));
            }

        }
        return stack.peek();
    }
}
