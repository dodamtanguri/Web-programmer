import java.util.Scanner;

public class ch2C_554 {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 중복을 제외한 숫자의 종류의 수를 계산하는 함수
     * @param data  원본 배열
     * @param n     원본 배열의 크기
     * @return  숫자의 종류의 수
     */
    public static int getElementTypeCount(int[] data, int n)
    {
        //모두 같은 종류의 포스터를 가졌더라도 countType은 우선 1개가 있음.
        int countType = 1;
        for(int i = 0; i < n-1; i++) {
            if(data[i] != data[i+1]) {
                countType++;
            }
        }

        return countType;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        int answer= getElementTypeCount(data, n);

        System.out.println(answer);
    }
}
