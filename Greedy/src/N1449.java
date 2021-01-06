import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 개수
        int l = Integer.parseInt(st.nextToken()); // 테이프의 길이


        int[] arr = new int[n]; // 물의 새는 곳의 개수만큼 배열을 만들어줌
        st = new StringTokenizer(br.readLine()); //두번째 줄 >> 물이 새는 위치
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int result = 0; // 필요한 테이프의 최소 개수
        //테이프의 범위
        int tape = (int) (arr[0] - 0.5) + l;
        result++;

        for (int i = 1; i < arr.length; i++) {
            if (tape < (int) (arr[i] + 0.5)) {
                tape = (int) (arr[i] - 0.5) + l;
                result++;
            }
        }
        System.out.println(result);
    }
}
