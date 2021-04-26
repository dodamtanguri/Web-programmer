public class 소수찾기 {
    public int 소수찾기(int n) {
        //에라토스테네스의 체
        int answer = 0;
        boolean[] result = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            result[i] = true; // 2부터 n번째까지의 수를 true로 초기화

        //제곱근 구하기
        int root = (int) Math.sqrt(n);

        for (int i = 2; i <= root; i++) {
            if (result[i]) {
                for (int j = i; i * j <= n; j++)
                    result[i * j] = false;
                }
            }
            for (int i = 2; i <= n; i++) {
                if (result[i])
                    answer++;
            }

            return answer;
        }


    public static void main(String[] args) {
        소수찾기 test = new 소수찾기();
        System.out.println(test.소수찾기(10));
    }
}
