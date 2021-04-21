import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        제일작은수제거하기 test = new 제일작은수제거하기();
        System.out.println(Arrays.toString(test.제일작은수제거하기(new int[]{4, 3, 2, 1})));
    }

    public int[] 제일작은수제거하기(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> numList = new ArrayList<Integer>();
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            numList.add(arr[i]);
        }
        int min = Collections.min(numList);

        numList.remove((Integer) min);

        answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}
