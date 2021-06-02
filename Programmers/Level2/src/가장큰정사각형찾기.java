public class 가장큰정사각형찾기 {
    // 1로만 이루어진 가장 큰 정사각형의 넓이
    // 연속되는 1이 몇개인지 세기..?
    //처음에는 연속되는 1의 개수를 세서 만들 수 있는 모든 정사각형의 넓이를 구해서 최대값을 뽑아 내려고 했음. >> 반복문이 많아져서 O(n^4)의 시간복잡도
    //딱봐도 시간초과할거같은 방법
    //그래서 좀 찾아보는데 다들 dp로 문제를 품.
    //[i][j] 위치의 값 == 정사각형 한 변의 길이
    // 1. 2 * 2 크기의 정사각형을 만든다고 생각하면 ( 1*1 은 안됨)
    // 2. [1][1]를 기준으로 (우측 하단으로 검사하기때문에 기준점을 여기로 잡음)
    // 3. 기준점으로 [1][0] = 1(왼쪽) [0][1]=1 (위쪽) [0][0]=0 왼쪽상단 을 확인했을때 왼쪽 상단이 0이라 정사각형을 만들 수 없음. (최대 정사각형의 한 변의 길이)
    // 4. 정사각형을 만들 수 없으니까 현재 최소값 +1 [0][0] + 1 >> [1][1] = 최소값 + 1 로 갱신
    // ## [i][j] 위치 값이 0이 아닌때 >> 다른 최대 정사각형 변을 구할 때 영향을 미칠 수 있기 때문


    public int solution(int [][]board)
    {
        int answer = 0;
        int [][] temp = new int[board.length+1][board[0].length+1];
        for (int i = 0 ;  i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                temp[i+1][j+1] = board[i][j];
            }
        }
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if (temp[i][j] != 0) {
                    temp[i][j] = Math.min(Math.min(temp[i-1][j],temp[i][j-1]),temp[i-1][j-1]) +1;
                    answer = Math.max(answer,temp[i][j]);
                }
            }
        }


        return answer * answer;
    }

    public static void main(String[] args) {
        가장큰정사각형찾기 test = new 가장큰정사각형찾기();
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        System.out.println(test.solution(board));
    }
}
