import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        주식가격 test = new 주식가격();
        int[] price = {1,2,3,2,3};
        System.out.println(Arrays.toString(test.solution(price)));
    }
}
