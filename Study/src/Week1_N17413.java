import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Week1_N17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String data = br.readLine();
        //stack 에 넣어서 하나씩 비교하면서 확인할 예정
        boolean tagCheck = false; // < > 태그 인지 아닌지 확인 하기 위한 변수

        Stack<Character> stack = new Stack<>();
        char [] arr = (data + "\n").toCharArray();
        int length = arr.length;
        //우선 태그가 들어오는지 확인
        //태그 시작
        for (int i = 0; i < length; i++ ) {
          if (arr[i] == '<') tagCheck = true;
            //태그가 있거나 공백을 만났을 경우 pop
          if (tagCheck || arr[i] == ' ' || arr[i] == '\n') {
              //stack에 쌓인 문자들이 비워질때까지 출력 하면 뒤집혀서 나옴
              while (!stack.isEmpty()) bw.write(stack.pop());
              if (arr[i] != '\n') bw.write(arr[i]);
          } else  {
              stack.push(arr[i]);
          }
          //태그 종료
          if (arr[i] == '>') tagCheck = false;
        }
        bw.flush();// 남아있는 데이터 모두 출력
    }
}
