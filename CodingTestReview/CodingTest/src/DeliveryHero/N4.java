package DeliveryHero;

public class N4 {
    //https://stackoverflow.com/questions/67407778/check-if-a-graph-has-a-cycle
    public boolean solution(int[] A, int[] B) {
        // write your code in Java SE 8

        int n = A.length;
        int[] map = new int[n];
        for (int i = 0; i < n; i++) {
            map[A[i] - 1] = B[i] - 1;
        }
        int len = 0;
        int curr = 0;
        do {
            curr = map[curr];
            len += 1;
        }
        while (curr != 0);
        return len == n;
    }
}
