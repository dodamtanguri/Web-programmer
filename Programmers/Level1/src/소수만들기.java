public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        boolean check = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (num >= 2)
                        check = primeNumber(num);
                    if (check)
                        answer++;
                }
            }
        }
        return answer;
    }

    private boolean primeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        소수만들기 test = new 소수만들기();
        System.out.println(test.solution(new int[]{1, 2, 7, 6, 4}));
    }
}
