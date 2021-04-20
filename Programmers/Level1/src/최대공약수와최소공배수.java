import java.util.Arrays;

public class 최대공약수와최소공배수 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        최대공약수와최소공배수 test = new 최대공약수와최소공배수();
        test.최대공약수와최소공배수(3, 12);
    }

    public int[] 최대공약수와최소공배수(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        System.out.println(Arrays.toString(answer));
        return answer;
    }


}
