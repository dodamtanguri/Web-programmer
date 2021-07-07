import java.util.Arrays;

public class NaverWebToon1 {
    public static void main(String[] args) {
        NaverWebToon1 test = new NaverWebToon1();
        int[] prices = {32000, 18000, 42500};
        int[] discounts = {50, 20, 65};
        System.out.println(test.solution(prices, discounts));
    }

    public int solution(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);
        int answer = 0;
        int idx = discounts.length - 1;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (idx >= 0) {
                answer += prices[i] * (1 - discounts[idx--]  / (float) 100);
            } else {
                answer += prices[i];
            }

        }
        return answer;
    }
}
