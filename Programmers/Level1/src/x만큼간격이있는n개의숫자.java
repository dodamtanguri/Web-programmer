import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        x만큼간격이있는n개의숫자 test = new x만큼간격이있는n개의숫자();
        test.x만큼간격이있는n개의숫자(2, 5);


    }

    public long[] x만큼간격이있는n개의숫자(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        System.out.println(Arrays.toString(answer));
        return answer;

    }
}
