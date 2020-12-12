import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine()); // Test Case
        int[] arr; // 1개의 Test Case 당 하나의 배열
        StringTokenizer st;
        for (int i = 0; i < C; i++) {
             st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 학생의 수
            arr = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];

            }
            int avg = (sum / N);
            int count = 0; //평균을 넘는 학생 수 변수
            // 평균점수를 넘는 학생들 숫자를 올려줌
            for (int j = 0; j < N; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f", (double) count * 100 / N) + "%");
        }
    }
}
