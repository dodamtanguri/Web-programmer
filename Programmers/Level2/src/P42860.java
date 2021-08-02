
public class P42860 {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();

        int min = len - 1;

        for (int i = 0; i < len; i++) {
            char target = name.charAt(i);
            int move = Math.min(target - 'A', 'Z' - target + 1);
            answer += move;

            int next = i + 1;
            while (next < len && name.charAt(next) == 'A')
                next++;

            min = Math.min(min, (i * 2) + len - next);
        }
        answer += min;

        return answer;
    }

    public static void main(String[] args) {
        P42860 test = new P42860();
        System.out.println(test.solution("JAN"));
    }
}
