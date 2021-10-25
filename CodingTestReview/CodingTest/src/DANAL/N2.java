package DANAL;

public class N2 {
    public static void main(String[] args) {
        N2 test = new N2();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(test.solution(10, arr));
    }

    public int solution(int n, int[] v) {
        int maxPrice = Integer.MIN_VALUE;
        int maxProfit = 0;

        for (int price : v) {
            maxPrice = Math.max(maxPrice, price);
            maxProfit = Math.max(maxProfit, maxPrice - price);

        }
        if (maxProfit == 0) {
            maxProfit = v[0] - v[1];
        }
        return maxProfit;
    }
}
