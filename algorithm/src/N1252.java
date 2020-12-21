import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class N1252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger decimalA = new BigInteger(st.nextToken(),2);
        BigInteger decimalB = new BigInteger(st.nextToken(),2);

        int sum = Integer.parseInt(String.valueOf(decimalA.add(decimalB)));

        String result = Integer.toBinaryString(sum);
        System.out.println(result);


        }

    }

