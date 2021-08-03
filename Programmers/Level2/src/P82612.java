public class P82612 {
    public long solution(int price, int money, int count) {

        long answer = -1;
        long sum = 0;
        if (price < money) return -1;
        if (price == 0) return money;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }
        answer = sum - money;
        if (answer < 0) {
            answer = 0;
        };
        return answer;
    }


    public static void main(String[] args) {
        P82612 test = new P82612();
        System.out.println(test.solution(1, 100, 1));
    }
}
