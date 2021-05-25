import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] answerTemp = {6,5,4,3,2,1};
        int winScore = 0;
        int unkownNum = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == 0) { unkownNum++; }
                if (win_nums[i] == lottos[j]) { winScore ++; }
            }
        }
       for (int i = 0; i < answerTemp.length; i++) {
           if (answerTemp[i] == winScore) {
               answer[0] = i;
           }
           if (answerTemp[i] == (winScore+unkownNum)) {
               answer[1] = i;
           }
       }

        return answer;
    }

    public static void main(String[] args) {
        로또의최고순위와최저순위 test = new 로또의최고순위와최저순위();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(test.solution(lottos, win_nums)));
    }
}
