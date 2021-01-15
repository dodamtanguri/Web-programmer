import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class N2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 센서의 개수
        int k = Integer.parseInt(br.readLine()); // 집중국의 개수
        StringTokenizer st;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        Integer[] distance = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) {
            distance[i] = arr[i + 1] - arr[i];
        }
        Arrays.sort(distance, Collections.reverseOrder());
        int result = 0;
        for (int i = k - 1; i < n - 1; i++) {
            result += distance[i];
        }
        System.out.println(result);



    }
}
