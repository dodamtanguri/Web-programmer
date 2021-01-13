import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
// todo 아직 못풀었음 다시 풀어보기 Hash Set 을 사용?
public class N1700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hole = Integer.parseInt(st.nextToken()); //콘센트 구멍의 개수
        int n = Integer.parseInt(st.nextToken()); // 사용하는 전자 제품의 개수

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }
}
