package DANAL;

public class N1 {

    static int[] dp, door;
    int round = 1;
    int i = 0;
    int answer = 0;
    door =new boolean[n];
        for(
    int i = 0;
    i<n;i++)

    {
        for (int k = 1; k <= n; k++) {
            if (k % round == 0) {
                door[k - 1] = !door[k - 1];
            }
        }
        round++;
    }

    {
        if (door[i]) answer++;
    }
        for(

    //https://www.acmicpc.net/problem/6359
    public static void main(String[] args) {
        N1 test = new N1();
        System.out.println(test.solution(5));


}


}
