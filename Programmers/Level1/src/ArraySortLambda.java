import java.util.Arrays;

public class ArraySortLambda {

    public static void solution(Pair[] arr) {
        Arrays.sort(arr, (Pair a, Pair b) -> {
            if (a.x > b.x) {
                return 1;
            } else if (a.x == b.x) {
                if (a.y > b.y) {
                    return 1;
                } else if (a.y == b.y) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        });
    }

    public static void main(String[] args) {
        Pair p = new Pair(0, 0);
        Pair p1 = new Pair(1, 2);
        Pair p2 = new Pair(1, 3);

        Pair p3 = new Pair(2, 0);
        Pair p4 = new Pair(2, 1);
        Pair p5 = new Pair(2, 2);

        Pair[] arr = new Pair[]{p5, p4, p3, p2, p1, p};

        solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
