package study1;

import java.io.*;
import java.util.StringTokenizer;

public class Week3_N9934 {
    static int k;
    static StringBuffer[] answer;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        //이진트리 Inorder
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //깊이
        k = Integer.parseInt(br.readLine());
        //노드의 개수 깊이가 K인 완전 이진 트리는 총 2^K-1개의 노드로 이루어져 있다
        int length = (int) Math.pow(2, k) - 1;
        arr = new int[length];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        answer = new StringBuffer[k];
        for (int i = 0; i < k; i++) {
            //StringBuffer 배열을 K만큼 만들어줌
            //Buffer의 인덱스 == level
            answer[i] = new StringBuffer();
        }
        //이미 순회한 배열을 레벨별로 끄내기 위해서 재귀함수 사용
        result(0, length - 1, 0);

        for (int i = 0; i < k; i++) {
            bw.write(answer[i].toString() + "\n");
        }
        bw.flush();


    }

    private static void result(int startIdx, int endIdx, int level) {
        //레벨 == k 라면 마지막 레벨이니까 중간값 구할 필요 X 그냥 리턴
        if (level == k)
            return;
        //중간 인덱스 구해서 buffer에 넣어줌
        int middleIdx = (startIdx + endIdx) / 2;
        answer[level].append(arr[middleIdx]).append(" ");
        //왼쪽 자식 노드
        result(startIdx, middleIdx - 1, level + 1);
        //오른쪽 자식 노드
        result(middleIdx + 1, endIdx, level + 1);

    }

}
