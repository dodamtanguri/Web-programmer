import java.util.Scanner;

public class ch1J_23047 {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 1부터 N까지의 자연수의 합을 계산하는 함수
     *
     * @param i
     * @return
     */

    public static int getRangeSumFromOne(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return sum;
    }


    public static long getAnswer(int N) {
        long temp = 0;
        for (int i = 1; i <= N; i++) {
            temp += getRangeSumFromOne(i);

        }
        return temp;
    }


    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();

        long answer = getAnswer(n);

        System.out.println(answer);
    }


}
