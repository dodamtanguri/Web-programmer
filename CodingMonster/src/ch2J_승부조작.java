import java.util.Scanner;

public class ch2J_승부조작 {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 게임의 규칙에 따라 현무가 승리할 수 있는 경우의 수가 존재하는지 검사하는 함수
     *
     * @param data
     * @param n
     * @param k
     * @return true   현무가 승리할 수 있는 경우의 수가 하나 이상 존재한다면
     * @return false  else
     */
    public static boolean isWinnable(int[] data, int n, int k) {

        int winCount = 0; //현무가 이겼을때 +1 해주기
        long sum = 0;
        for(int i = 0; i < k-1; i++) {
            sum += data[i];
        }

        for(int i = 0; i + (k-1) < n; i++) {
            if (i > 0) {
                sum -= data[i-1];
            }
            //오른쪽에 새로 들어온 영역의 데이터 더해주기
            sum = sum + data[i + (k-1)];
            if(sum % 2 == 0) { // 현무가 이겼을 경우
                winCount++;
                break;
            } else {
                continue;
            }
        }

        if(winCount > 0)
        {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        boolean result = isWinnable(data, n, k);

        if(result)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
