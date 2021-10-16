package 중고나라2021_10_04;

public class P3 {
    int answer = 0;

    public static void main(String[] args) {
        P3 test = new P3();
        System.out.println(test.solution(new int[]{8, 3, 5, 7, 4, 3}));
    }

    public void dfs(int dept, int[] numbers) {
        if (dept == numbers.length) {
            int sum = 0;
            for (int num : numbers) sum += num;

            if (sum == 0)
                this.answer++;
            return;
        }


        dfs(dept + 1, numbers);
        numbers[dept] *= -1;
        dfs(dept + 1, numbers);
    }

    public int solution(int[] numbers) {
        dfs(0, numbers);


        return this.answer;
    }
}
