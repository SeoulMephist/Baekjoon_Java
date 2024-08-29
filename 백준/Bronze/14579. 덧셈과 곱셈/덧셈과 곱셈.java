import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int fact = 0;
        long result;

        for (int i = 1; i <= a; i++) {
            fact += i;
        }

        result = fact;

        for (int i = a+1; i <= b; i++) {
            fact += i;
            result *= fact;
            result %= 14579;
        }
        System.out.println(result);
    }
}