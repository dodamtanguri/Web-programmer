import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
시간표를 최대한 많이 배정하거나 선택하는 문제 >> '활동 선택 문제(Activity Selection Problem)'라고 함.
한 사람이 하나의 활동에 대해서만 작업할 수 있을 때 최대한 많은 활동을 할 수 있는 수를 선택하는 문제
>>하나의 활동을 완료하기 전까지는 다른 활동을 선택할 수 없음. 하나의 활동을 선택하면 나머지 겹치지 않는 활동에 대해서 독립적이고, 탐욕 선택이 이후의 결과에 영향을 미치지 않는다.
https://en.wikipedia.org/wiki/Activity_selection_problem
 */
public class N1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 회의의 수
        int[][] arr = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            arr[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }
        //Comparable 와 Comparator Java 객체 정렬
        Arrays.sort(arr, new Comparator<int[]>() { //익명클래스 사용
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int result = 0;
        for (int i =0; i<n; i++) {
            if (result <= arr[i][0]) {
                result = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
