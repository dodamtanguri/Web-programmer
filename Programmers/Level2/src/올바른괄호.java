import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        올바른괄호 test = new 올바른괄호();
        System.out.println(test.solution("()))((()"));
    }
    //stack(Last In First Out)
    //괄호의 짝이 맞는지 확인

    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> temp = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                //( 일 경우 temp 에 추가
                temp.push(s.charAt(i));
            } else {
                // )일때 이전 스택이 비어있는거면 괄호가 짝이 맞지 않는거임.
                if (temp.isEmpty()) return answer;
                else temp.pop();
            }
        }
        answer = temp.isEmpty();
        return answer;
    }
}
