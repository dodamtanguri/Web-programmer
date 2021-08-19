import java.util.Scanner;

public class ch2A_554 {
    public static final Scanner scanner = new Scanner(System.in);
    /**
     * 생일이 m월인 가장 큰 키의 도토리를 찾는 함수
     * @param height  각 도토리의 키
     * @param month   각 도토리의 출생 월
     * @param n   도토리의 수
     * @param m   찾고자 하는 달
     * @return    month[k] == m인 가장 큰 height[k]
     */
    public static int getMaximumHeight(int[] height, int[] month, int n, int m)
    {

        int result = -1;
        for(int i = 0; i < n; i++) { //애초에 도토리키가 오름차순으로 정렬되어있다는 조건이 있으니까
            //반복문을 뒤에서부터 해서 확인하면 키가 작은지 큰지 확인 할 필요가 없음.

            if(m == month[i] && result < height[i]) {  // 키를 확인 할 필요가 없으니 result < height[i] 의 연산도 필요가 없게 됨.
                result = height[i];
                //가장 큰 키에서 부터 시작을 했으니 더이상 연산을 할필요가 없음. >> break; 로 반복문 멈추기.
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] height = new int[n];
        int[] month = new int[n];

        for(int i = 0 ; i < n ; i ++)
        {
            height[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            month[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        int answer = getMaximumHeight(height, month, n, m);

        System.out.println(answer);
    }


}
