

public class P12899 {
    public String solution(int n) {
        //나머지 연산으로 나온 숫자를 인덱스로 하는 124나라의 숫자를 나타내는 String 타입의 배열을 하나 만들어줌.
        /*
        1 % 3 = 1 => 1
        2 % 3 = 2 => 2
        3 % 3 = 0 => 4

         */
        String[] numbers = {"4", "1", "2"};
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            n /= 3;

            if (remainder == 0) n--;
            answer.insert(0, numbers[remainder]);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tutorial");
        System.out.println("String = " + sb);

        //insert character value at offset 8
        sb.insert(8,'s');

        //prints StringBuilder after insertion
        System.out.println("After insertion = ");
        System.out.println(sb.toString());

    }
}
