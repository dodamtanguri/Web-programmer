import java.io.IOException;
import java.util.Scanner;


public class N9095 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] d = new int[11];
        d[0] = 1;
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i < d.length; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
