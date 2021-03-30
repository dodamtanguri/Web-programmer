import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = 1;

        while (true) {
            int answer = 0;
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            //0 0 0이 들어오면 종료
            if (l == 0 && p ==0 && v== 0) break;
            while (v > 0){
                int token = 0;
                if (v >= p) {
                    token = p;
                    v -= p;
                } else {
                    token = v;
                    v = 0;
                }
                if (token >= l) answer += l;
                else answer += token;
            }
            System.out.println("Case "+tc+": "+answer);
            tc++;
        }

    }
}
