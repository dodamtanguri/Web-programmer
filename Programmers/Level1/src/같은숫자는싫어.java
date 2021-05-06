import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i =0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                result.add(arr[i]);
            }
        }
        result.add(arr[arr.length-1]);
        int[] answer = new int[result.size()];
        for (int i= 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        같은숫자는싫어 test = new 같은숫자는싫어();
        System.out.println(Arrays.toString(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
