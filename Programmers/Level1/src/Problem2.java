import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem2 {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp.add(arr[i]);
                count++;
            }
        }
        if (count == 0) {
            temp.add(-1);
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Problem2 test = new Problem2();
        int[] arr = {5,9,7,10};
        System.out.println(Arrays.toString(test.solution(arr, 5)));
    }
}
