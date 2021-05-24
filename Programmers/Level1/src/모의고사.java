import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 모의고사 {

    public int[] solution(int[] answers) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int[] temp = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (num1[i%5] == answers[i]) temp[0]++;
            if (num2[i%8] == answers[i]) temp[1]++;
            if (num3[i%10] == answers[i]) temp[2]++;
        }
        ArrayList<Integer> tempScore = new ArrayList<>();
        int max = Math.max(Math.max(temp[0],temp[1]),temp[2]);
        if (max == temp[0]) tempScore.add(1);
        if (max == temp[1]) tempScore.add(2);
        if (max == temp[2]) tempScore.add(3);
        Collections.sort(tempScore);

        int[] answer = new int[tempScore.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tempScore.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        모의고사 test = new 모의고사();
        System.out.println(Arrays.toString(test.solution(new int[]{1, 2, 3, 4, 5})));
    }
}
