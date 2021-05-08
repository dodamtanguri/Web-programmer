public class 숫자놀이 {
    public static void main(String[] args) {
        숫자놀이 test = new 숫자놀이();
        System.out.println(test.solution("one4seveneight"));
    }

    public int solution(String s) {
        int answer = 0;
        String temp = "";

        temp = s.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");
        answer = Integer.parseInt(temp);

        return answer;
    }
}
