public class sieveOfEratosthenes {

    public static void main(String[] args) {
        sieveOfEratosthenes test = new sieveOfEratosthenes();
        System.out.println(test.isPrimeNumber(97));
        System.out.println(test.isPrimeNumber2(92));

        test.isPrimeNumberSieve();
    }

    public boolean isPrimeNumber(int x) {
        //소수판별알고리즘
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    //특정한 숫자의 제곱근까지만 약수의 여부를 검증 >> 2 * 4 = 4 * 2 대칭을 이루고 있음.
    public boolean isPrimeNumber2(int x) {
        //제곱근(루트) Math.sqrt() return doubleNumber
        int end = (int) Math.sqrt(x);
        for (int i = 2; i <= end; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    //대량의 소수를 한꺼번에 판별하고자 할때 사용 >> 에라토스테네스의 체
    public void isPrimeNumberSieve() {
        int number = 100000;
        int[] arr = new int[100001];
        for (int i = 2; i <= number; i++) {
            arr[i] = i; //자기자신의 index로 배열 초기화
        }
        for (int i = 2; i <= number; i++) {
            // 특정한 숫자의 배수들을 다 지워줌. (자기자신 제외)
            //이미 지워진 숫자라면 지나감
            if (arr[i] == 0) continue;
            //그 배수부터 시작을 해서 가능한 모든 숫자를 모두 지워줌.
            for (int j = i + i; j <= number; j += i) {
                arr[j] = 0; // 0으로 바꾼거는 지워진 의미랑 같음.
            }
        }
        //지워진 숫자들 ("0")을 제외한 숫자 출력
        for (int i = 2; i <= number; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
