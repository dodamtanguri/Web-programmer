import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] temp = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (temp[i] - 68 < 0) {
                sb.append((char) (temp[i] + 23));
            } else {
                sb.append((char) (temp[i] - 3));
            }
        }
        System.out.println(sb);
    }
}
