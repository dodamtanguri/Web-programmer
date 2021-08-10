public class P83201 {
    public String solution(int[][] scores) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < scores.length; i++) {

            int myScore = scores[i][i];
            double myTotalScore = 0;
            boolean isHighestScore = true;
            boolean isLowestScore = true;
            boolean isSameScore = false;

            for (int j = 0; j < scores.length; j++) {
                myTotalScore += scores[j][i];
                if (myScore > scores[j][i]) {
                    isHighestScore = false;
                }
                if (myScore < scores[j][i]) {
                    isLowestScore = false;
                }
                if (j != i && myScore == scores[j][i]) {
                    isSameScore = true;
                }

            }
            int studentCnt = scores.length;
            if (!isSameScore && (isHighestScore || isLowestScore)) {
                myTotalScore -= myScore;
                studentCnt--;
            }

            sb.append(scoreToRank(myTotalScore / studentCnt));
        }
        return sb.toString();

    }

    private char scoreToRank(double score) {
        if (score >= (double) 90) return 'A';
        if (score >= (double) 80) return 'B';
        if (score >= (double) 70) return 'C';
        if (score >= (double) 50) return 'D';
        return 'F';


    }

    public static void main(String[] args) {
        P83201 test = new P83201();
        int[][] temp = new int[][]{{50, 90}, {50, 87}};

        System.out.println(test.solution(temp));
    }
}
