import java.util.Arrays;
import java.util.Scanner;

public class N2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] temp = new int[9];
        int tempHeight = 0;
        for (int i = 0; i < 9; i++) {
            temp[i] = sc.nextInt();
            tempHeight += temp[i];
        }
        Arrays.sort(temp);
        // 차음에 그냥 하나씩 더하면서 새로운 배열에 숫자 넣어주려고 했는데 자원낭비? 가 심할거같아씀
        //안되면 거꾸로 생각해보기
        //다 더하고 2개씩 빼면서 100을 찾음
        int height =100;
        for (int i = 0; i<9; i++) {
            for (int j = i+1; j < 9; j++) {
                if (tempHeight-temp[i]-temp[j] == height){
                    for (int k = 0; k < 9; k++) {
                        if (i == k || j == k) {
                            continue;
                        }
                        System.out.println(temp[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
