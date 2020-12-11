import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int minNum = 0; // 맨처음부터 자신의 인출이 끝날때까지의 걸리는 시간 (분)
        Arrays.sort(arr); //오름차순 정렬
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            minNum += arr[i];
            sum += minNum;
        }
        System.out.println(sum);
    }
}
