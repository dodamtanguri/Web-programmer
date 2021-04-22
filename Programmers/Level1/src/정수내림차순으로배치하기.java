import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        정수내림차순으로배치하기 test = new 정수내림차순으로배치하기();
        System.out.println(test.정수내림차순으로배치하기(118372));
    }

    public long 정수내림차순으로배치하기(long n) {
        long answer = 0;
        String temp = String.valueOf(n);
        String[] arr = new String[temp.length()];
        arr = temp.split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]) * Math.pow(10, i);
        }
        return answer;
    }
}
