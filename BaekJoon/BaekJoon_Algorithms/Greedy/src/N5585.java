import java.util.Scanner;

public class N5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        n = 1000 - n;
        result += n / 500;
        n %= 500;
        result += n / 100;
        n %= 100;
        result += n / 50;
        n %= 50;
        result += n / 10;
        n %= 10;
        result += n / 5;
        n %= 5;
        result += n / 1;
        n %= 1;
        System.out.println(result);
    }
}
