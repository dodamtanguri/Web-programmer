package 중고나라2021_10_04;

public class p2_2 {
    static int answer;

    public static void main(String[] args) {
        p2_2 test = new p2_2();
        System.out.println(test.solution(4));
    }

    public long solution(long k) {
        int line = 0;
        int cnt = 0;
        while (cnt < k) {
            line++;
            //등차수열 이용 n(n+1)/2
            //n번째 까지의 항의 개수 몇번째 줄에 위치한 항인지 개수 판단
            cnt = line * (line + 1) / 2;
        }
        return line - (cnt - k);
    }
}
