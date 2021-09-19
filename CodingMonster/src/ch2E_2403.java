import java.lang.*;
import java.util.*;


public class ch2E_2403 {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 주어진 숫자가 소수인지 판별하는 함수
     *
     * @param N
     * @return true   소수라면
     * @return false  소수가 아니라면
     */
    public static boolean isPrime(int N) {
        if (N == 1) return false;
        else if (N == 2) return true;
        else if (N % 2 == 0) return false;
        //소수 알고리즘 판별할때 해당 숫자의 루트까지 확인 하는 방법 >> 약수의 중심을 구하는 방법
        for (int i = 3; i * i < N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static void testCase(int caseIndex) {
        int n = scanner.nextInt();
        boolean result = isPrime(n);

        System.out.printf("Case #%d\n", caseIndex);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws Exception {
        int caseSize = scanner.nextInt();

        for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
            testCase(caseIndex);
        }
    }

}