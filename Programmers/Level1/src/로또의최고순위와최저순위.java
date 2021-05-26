import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        로또의최고순위와최저순위 test = new 로또의최고순위와최저순위();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(test.solution(lottos, win_nums)));
    }
    public int getRank (int n){
        switch (n) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;

        }
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
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
        answer[0] = getRank(winScore + unkownNum);
        answer[1] = getRank(winScore);

        return answer;
    }
}
