import java.util.Arrays;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        약수의개수와덧셈 test = new 약수의개수와덧셈();
        System.out.println(test.solution(13, 17));
    }

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= left; j ++)
                if (i % j == 0) count++;

            if (count % 2 == 0)
                answer += i;
             else
                answer -= i;
             left++;
        }
        return answer;
    }
}
