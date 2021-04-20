public class 콜라츠추측 {
    public static void main(String[] args) {
        콜라츠추측 test = new 콜라츠추측();
        test.콜라츠추측(626331);
    }

    public int 콜라츠추측(int num) {
        long n = (long)num;
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else  {
                n = 3*n + 1;
            }
            count++;
            if (count == 500) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
        return count;
    }
}
