import java.util.Arrays;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        행렬의곱셈 test = new 행렬의곱셈();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(test.solution(arr1, arr2)));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int n = 0; n < arr1[0].length; n++) {
                    answer[i][j] += arr1[i][n] * arr2[n][j];
                }

            }

        }
        return answer;
    }
}
