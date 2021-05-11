
import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        //d에서 많은수를 뽑은거 합이 budget이 되도록 하기
        int temp = 0;
        for (int i = 0; i < d.length; i++) {
            temp += d[i];
            if (budget < temp) {
                break;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        예산 test = new 예산();
        System.out.println(test.solution(new int[]{1, 3, 2, 5, 4},9));
    }
}
