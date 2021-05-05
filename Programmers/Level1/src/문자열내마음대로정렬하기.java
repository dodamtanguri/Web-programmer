import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    static class Solution {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(Arrays.toString(solution.solution(new String[]{"sun", "bed", "car"}, 1)));
        }

        public String[] solution(String[] arr, int n) {
            Arrays.sort(arr, (a, b) -> {
                if (a.charAt(n) > b.charAt(n)) {
                    return 1;
                } else if (a.charAt(n) == b.charAt(n)) {
                    return a.compareTo(b);
                } else {
                    return -1;
                }
            });
            return arr;
        }
    }
}
