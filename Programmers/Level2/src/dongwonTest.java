import java.util.ArrayList;

public class dongwonTest {
    public int soultion(int[] estimates, int k) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0 ; i < estimates.length; i++) {
//            int tempSum = 0;
//            for (int j = i; j < i+k; j++) {
//                if ( i+k > estimates.length) {
//                    break;
//                }
//                tempSum += estimates[j];
//            }
//            max = Math.max(max,tempSum);
//        }
//        return max;
        if(estimates.length < k) {
            System.out.println("Invalid");
            return -1;
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            res += estimates[i];
        }

        int current_sum = res;
        for (int i = k; i<estimates.length; i++){
            current_sum += estimates[i]-estimates[i-k];
            res = Math.max(res,current_sum);
        }
        return res;
    }

    public static void main(String[] args) {
        dongwonTest test = new dongwonTest();
        System.out.println(test.soultion(new int[]{10,1,10,1,1,4,3,10},6));
    }
}
