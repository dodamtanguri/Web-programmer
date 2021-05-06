import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        비밀지도 test = new 비밀지도();
        System.out.println(Arrays.toString(test.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] | arr2[i];
            String resultBinary = Integer.toBinaryString(result[i]);
            String format = String.format("%0" + n + "d", Long.parseLong(resultBinary)).replace("1", "#")
                    .replace("0", " ");
            answer[i] = format;
        }
        return answer;
    }
}
