import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int distance = Integer.parseInt(bf.readLine());
        int answer = (int)Math.ceil((double)distance/5);

        System.out.println(answer);
    }
}
