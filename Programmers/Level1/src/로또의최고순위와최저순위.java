import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        로또의최고순위와최저순위 test = new 로또의최고순위와최저순위();
        int[] lottos = {38, 19, 20, 40, 15, 25};
        int[] win_nums = {39, 20, 21, 41, 16, 26};
        System.out.println(Arrays.toString(test.solution(lottos, win_nums)));
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] answerTemp = {6, 5, 4, 3, 2, 1};
        int winScore = 0;
        int unkownNum = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                unkownNum++;
            }
            for (int j = 0; j < lottos.length; j++) {
                if (win_nums[i] == lottos[j]) {
                    winScore++;
                }
            }
        }
        for (int i = 0; i < answerTemp.length; i++) {
             if (answerTemp[i] == (winScore + unkownNum)) {
                answer[0] = i + 1;
            }
            if (winScore == 0) {
                answer[1] = 6;
            } else if (answerTemp[i] == winScore) {
                answer[1] = i + 1;
            }
        }

        return answer;
    }
}
