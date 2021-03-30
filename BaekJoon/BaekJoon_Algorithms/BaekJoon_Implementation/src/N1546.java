import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[t];
        int M = Integer.MIN_VALUE; // /M*100
        int total = 0;
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            M = Math.max(arr[i], M);
            total +=arr[i];
        }

        double avg =  (double) total / M * 100 / t;
        System.out.println(avg);
    }
}
