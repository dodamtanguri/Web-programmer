
import java.lang.*;
import java.util.*;


public class ch2F_BubbleSort {
    public static final Scanner scanner = new Scanner(System.in);
    static void change(int[] data, int idx1, int idx2) {
        int temp = data[idx1];
        data[idx1] = data[idx2];
        data[idx2] = temp;

    }
    public static void bubbleSort(int[] data, int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            //n-1 을 하는 이유 >> n-1개의 요소의 정렬이 끝나면 마지막 요소는 이미 끝에 놓이기때문에
            //-i를 하는 이유 >> 앞쪽의 i개의 요소는 정렬이 끝난 상태라고 가정하기 때문
            for(int j = 0; j < n -1 -i; j++) {
                //j보다 j+1 의 값이 크다면 두개의 값을 바꿔줘야함
                if(data[j] > data[j+1]) {
                 change(data,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            data[i] = scanner.nextInt();
        }

        bubbleSort(data, n);

        for(int i = 0 ; i < n ; i++)
        {
            if( i > 0 )
            {
                System.out.print(" ");
            }
            System.out.print(data[i]);
        }
    }

}