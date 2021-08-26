import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Week1_N20207 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //일정의 개수
        StringTokenizer st;
        //달력생성
        int[] cal = new int[367];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            //달력 배열에 input data start ~ end date 카운팅 해줌
            for (int k = start; k <= end; k++) {
                cal[k]++;
            }

        }

        int row = 0; //세로
        int col = 0; //가로
        int answer = 0;
        for (int i = 1; i < 367; i++) {
            if (cal[i] > 0) {
                col++;
                row = Math.max(row, cal[i]);
            } else if (cal[i] == 0) {
                answer += (col * row);
                col = 0;
                row = 0;
            }
        }
        System.out.println(answer);
    }
}
