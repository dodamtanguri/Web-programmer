import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public int[] 자연수뒤집어배열로만들기(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 test = new 자연수뒤집어배열로만들기();
        System.out.println(Arrays.toString(test.자연수뒤집어배열로만들기(12345)));
    }
}
