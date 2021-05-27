import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        최솟값만들기 test = new 최솟값만들기();
        System.out.println(test.solution(a, b));
    }

    public int solution(int[] A, int[] B) {

        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            //거꾸로 곱해줌
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }
}
