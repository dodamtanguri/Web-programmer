import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class N2755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[][] arr = new String[t][3];
        double sum = 0; // >> 성적의 합
        double total = 0; // 학점

        for (int i = 0; i < t;i++) {
            double temp = 0;
            for (int j = 0; j < 3; j++) {

            }
            String score = arr[i][2];
            if (score.charAt(0) == 'A') {
                temp = 4.0;
            }else if (score.charAt(0) == 'B')  {
                temp = 3.0;
            }else if (score.charAt(0) == 'C') {
                temp = 2.0;
            } else if (score.charAt(0) == 'D') {
                temp = 1.0;
            } else if (score.charAt(0) == 'F') {
                temp = 0.0;
            }


            if (score.charAt(1) == '+') {
                temp += 0.3;
            } else if (score.charAt(1) == '-') {
                temp -= 0.3;
            }

            sum += Integer.parseInt(arr[i][1]) * temp;
            total += Integer.parseInt(arr[i][1]);


        }
        System.out.println(sum / total);
    }
}
