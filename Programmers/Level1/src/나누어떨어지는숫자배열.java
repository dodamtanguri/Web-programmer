import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
             if (answer.isEmpty())  answer.add(-1);


        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 test = new 나누어떨어지는숫자배열();
        System.out.println(Arrays.toString(test.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(test.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(test.solution(new int[]{3,2,6}, 10)));


    }
}
