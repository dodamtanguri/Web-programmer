public class 정수제곱근판별 {
    public static void main(String[] args) {
        정수제곱근판별 test = new 정수제곱근판별();
        System.out.println(test.정수제곱근판별(-1));
    }

    public long 정수제곱근판별(long n) {
        long answer = 0;
        long temp = (long) Math.sqrt(n);
        long temp2 = (long)Math.pow(temp,2);
        if (temp2 == n) {
            answer = (temp + 1) * (temp + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}
