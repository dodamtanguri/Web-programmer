import java.util.Scanner;


public class ch1H_22887 {
    public static final Scanner scanner = new Scanner(System.in);


    /**
     * 평균과의 차가 가장 작은 데이터의 번호를 반환하는 함수
     * 여러 가지라면 가장 빠른 번호를 반환한다.
     *
     * @param data
     * @param n
     * @return int  가장 평균과 가까운 데이터의 번호 (1번부터 시작)
     * 평균은 항상 실수
     * 실수를 사용해서 값을 비교하는 것은 최대한 지양해야한다.
     * 절대값을 씌우면
     *
     * |data[a]-avg| < |data[b]-avg|
     * 
     * * * */

    public static int findIndex(int[] data, int n)
    {

    }

    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        int answer = findIndex(data, n);
        int index = answer - 1;

        System.out.printf("%d %d\n", answer, data[index]);
    }

}

