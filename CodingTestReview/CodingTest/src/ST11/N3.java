package ST11;

public class N3 {
    public static void main(String[] args) {
        N3 test = new N3();
        int[] data = {10, 10, 10};
        System.out.println(minMoves(data));
    }

    public static int minMoves(int[] A) {
        int minOperations = 0;
        for (int i = 0, j = 0; i < A.length; i = j) {
            while (j < A.length && A[i] == A[j]) j++;
            int frequency = j - i;
            minOperations += Math.min(Math.abs(A[i] - frequency), frequency);
        }
        return minOperations;
    }
}
