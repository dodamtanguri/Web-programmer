package ST11;

import java.util.Arrays;

public class N1 {
    public static void main(String[] args) {
        N1 test = new N1();
        int[] A = {2, 6, 4, 6};
        System.out.println(test.solution(A));
    }

    public int solution(int[] A) {
        int maxEven = Arrays.stream(A)
                .filter(even -> even % 2 == 0)
                .max()
                .orElse(0);
        int maxOdd = Arrays.stream(A)
                .filter(odd -> odd % 2 != 0)
                .max()
                .orElse(0);

        return maxEven + maxOdd;

    }

}
