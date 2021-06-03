import java.util.Arrays;

public class 카펫 {

    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        for (int i = 1; i <= total; i++) {
            if (total % i == 0) {
                int col = total / i; // 가로
                int row = total / col; //세로

                int a = col - 2;
                int b = row - 2;
                if (a*b == yellow && col >= row) {
                    return new int[]{col,row};
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        카펫 test = new 카펫();
        System.out.println(Arrays.toString(test.solution(8, 1)));
    }
}
