public class Euclid {
    //유클리드호제법
    //A를 B로 나눈 나머지가 C일 때, (A와 B의 최대 공약수) = (B와 C의 최대 공약수)라는 사실
    public int gcd (int a, int b) {
        while (b != 0) {
            int r = a % b; // 나머지 구하기
            //GCD(a,b) = GCD(b,r) 변환
            a = b;
            b = r;
        }
        return a;
    }

    public int gcd2(int a, int b) {
        if (b == 0) return a;
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd2(b, a%b);
    }

    public int lcm(int a, int b) {
        return a * b/gcd(a,b);
    }

    public static void main(String[] args) {
      Euclid test = new Euclid();
        System.out.println("최대공약수 반복문 방식 : " + test.gcd(15,5));
        System.out.println("최대공약수 재귀 방식 : " + test.gcd2(12,4));
        System.out.println("최소공배수 : " + test.lcm(36,6));
    }
}
