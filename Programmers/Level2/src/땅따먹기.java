import java.util.Arrays;

public class 땅따먹기 {
    //모든 열을 포함하지 않아서 그리디 x
    //각 행의 열마다 최대값 갱신
    int solution(int[][] land) {

for (int i = 1; i < land.length; i++) {
    land[i][0] += Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
    land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
    land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
    land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
}

        int[] answer = land[land.length-1];
        Arrays.sort(answer);

        return answer[answer.length-1];
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        땅따먹기 test = new 땅따먹기();
        System.out.println(test.solution(arr));
    }
}
